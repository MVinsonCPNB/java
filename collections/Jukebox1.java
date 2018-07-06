import java.util.*;
import java.io.*;

public class Jukebox1{
    
    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args){
        new Jukebox1().go();
    }
    
    /* Create a new inner class that implements Comparator
     * (note that its type parameter matches the type we'er
     * going to compare --in  this case Song objects.) Below
     * the one.getArtist() part is considered a string therefore
     * string.compareTo(two.getArtist()) is what takes place in 
     * the return statement.  See page 553 of Jave Head First.
     * */
    class ArtistCompare implements Comparator<Song>{
        public int compare(Song one, Song two){
            return one.getArtist().compareTo(two.getArtist());
        }
    }

    public void go(){
        getSongs();
        System.out.println("Unsorted PlayList:"); 
        System.out.println("\t" + songList);
        Collections.sort(songList);
        System.out.println("Sort Song by Title:");
        System.out.println("\t" + songList);

        ArtistCompare artistCompare = new ArtistCompare();
        Collections.sort(songList, artistCompare);
        System.out.println("Sort Song by Artist:");
        System.out.println("\t" + songList);

        /*  HashSet has a simple addAll() method that can
         *  take another collection and use it to populate
         *  the HashSet. It's the same as if we added each
         *  song one at a time (except much simpler).
         * */
        HashSet<Song> songSet = new HashSet<Song>();
        songSet.addAll(songList);
        System.out.println("Unsorted HashSet of the Arraylist<Song>");
        System.out.println("\t" + songSet + "\n");
        System.out.println("Was able at add songSet.songList.get(0)? " + songSet.add(songList.get(0)));
        
        System.out.println("\n\nHashCodes of Each Object:");
        for(Song s: songList){
            System.out.println(s.hashCode() + " = " +  s.getTitle());
        }
    }

    void getSongs(){
        try{
            File file = new File("SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null){
                addSong(line);
            }
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }

    void addSong(String lineToParse){
        String[] tokens = lineToParse.split("/");
        
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }
}// close class Jukebox1
