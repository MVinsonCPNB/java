class Song implements Comparable<Song> {
    String title;
    String artist;
    String rating;
    String bpm;

    /* Overridding the equals method from Comparable */
    public boolean equals(Object aSong){
        Song s = (Song) aSong;
        return getTitle().equals(s.getTitle());
        /* The GREAT news is that title is a String
         * and Strings have an overridden equals()
         * method. So all we have to do is ask one
         * title if it's equal to the other song's title.
         * */
    }

    /* The compareTo overridding is used by the automatic
     * sorting method invoked by the TreeSet when adding 
     * data to the collection structure */

    public int compareTo(Song s){
        return title.compareTo(s.getTitle());
    }

    /* hashCode() overridding 
     *
     * By overridding the hashCode() method the 
     * hashSet will evaluate the titles and not 
     * the objects memory address.
     * */

    public int hashCode(){
        return title.hashCode();
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
