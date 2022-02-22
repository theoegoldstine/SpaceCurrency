import java.io.*;
import sun.audio.*;


public class SpaceCurrency {
    public static void main(String[] args) throws Exception {
        System.out.println();
        System.out.println("June 21, 2040:");
        System.out.println("It's been five years since Space Exploration Technologies Corp. first landed the Starship on Mars...");
        System.out.println("Today, in a joint address from SpaceX Headquarters in Hawthorne, California, and the Lyndon Johnson Space Center in Houston, Texas,...");
        System.out.println("SpaceX CEO Elon Musk, SpaceX President Gwynne Shotwell, and the Preisdent of the United States announced that last month NASA scientists  discovered life on Mars, Saturn, and Neptune...");
        System.out.println("SpaceX has been able to land the Starship on Saturn and Neptune, and Autodrive the Tesla Model R (Martian Rover) to the Martian's habitats, and the scientists have achieved friendly contact with the leaders of these civilizations...");
        SpaceCurrency.PlayMusic("src/LifeOnMars.wav");
        System.out.println();
        System.out.println("~~~Playing Life on Mars by David Bowie~~~");
        System.out.println();
        System.out.println("In order to build a successful and friendly intergalactic economy, Saturn's Lord of the Rings, the Secretary-General of the International Space Authority of Earth, the Neptunian Ruling Superintelligence, and the High Empress of Grand Counselors of the United Tribes of the Martian Dunes and Craters met at the Aldrin Superbase on Mars...");
        System.out.println("The Group of 4 have agreed to implement a intergalactic network called the DataBeam to connect the Solar System within two weeks...");
        System.out.println("The three planets have also agreed to implement planatery financial systems and currencies to allow for  more efficient intergalactic commerce...");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("<-- INITIATING THE NEIL ARDEN ARMSTRONG INTERGALACTIC DATA LASERBEAM NETWORK PROTOCOL-->");
        System.out.println();
        System.out.println();
        System.out.println("<-- IMPLEMENTING INTERGALACTIC FINANCIAL SYSTEMS -->");


        Currency mars = new Mars(100.00);
        Currency neptune = new Neptune(100.00);
        Currency saturn = new Saturn(100.00);

        

        System.out.println("<-- INTERGALACTIC CURRENCY EXCHANGE -->");

        mars.exchange(saturn, 25.00);
        neptune.exchange(saturn, 10.00);
        saturn.exchange(mars, 122.00);
        saturn.exchange(mars, 121.00);

        
    }


    public static void PlayMusic(String fileName) throws Exception {
        //Thank you to Max O'Didily's Youtube Channel for the Tutorial
        InputStream file;
        try {
             file = new FileInputStream(new File(fileName));
             AudioStream audios = new AudioStream(file);
             AudioPlayer.player.start(audios);
        }
        catch(Exception e) {
            System.out.println("Error playing music");
        }
    }
}