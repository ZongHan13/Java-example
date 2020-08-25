package song;

public class App {
    public static void main(String[] args) {
        Song holiday = new Song("Holiday", "Green Day", 200);
        Song americanIdiot = new Song("American Idiot", "Green day", 168);

        System.out.println(holiday.getArtist());
        System.out.println(holiday.getTitle()); 
        System.out.println(americanIdiot.getSongsCount());
            
        
    }
}