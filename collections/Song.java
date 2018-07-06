class Song implements Comparable<Song> {
    String title;
    String artist;
    String rating;
    String bpm;

    public int compareTo(Song s){
        return title.compareTo(s.getTitle());
    }

    Song(String t, String a, String r, String b){
        title = t;
        artist = a;
        rating = r;
        bpm = b;
    }

    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }

    public String getRating(){
        return rating;
    }

    public String getBpm(){
        return bpm;
    }

    /* Override the toString() method from the super Object class
     * becasue when you do a System.out.println(aSongObject), it
     * calls the toString() method of EACH element in the list.
     * */
    public String toString(){
        return title;
    }
}
