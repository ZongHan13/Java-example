package song;

public class Song {
    private String title;
    private String artist;
    private int length;
    private static int songsCount = 0;

    public Song(String title, String artist, int length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
        songsCount++;
        System.out.println("song count : " + songsCount);
    }

    public int getSongsCount() {
        return songsCount;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

}