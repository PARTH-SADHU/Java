import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.util.Scanner;

public class Audio {
    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);

            File file = new File("D:\\intellij_projects\\Java-DSA\\src\\Atmospheric-ambient-music.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            String userInput = "";
            clip.open(audioStream);

            System.out.println("Muzic Player");

            while(!userInput.equals("Q")){
                System.out.println("Press P to play the song " +
                        "| Press S to stop the song " +
                        "| Press R to Reset the song |" +
                        "| Press Q to Quit the music player|");
                System.out.print("Choose any option you want : ");
                userInput = scan.next();
                userInput = userInput.toUpperCase();

                switch(userInput){
                    case "P" : clip.start();
                        break;
                    case "S" :clip.stop();
                        break;
                    case "R" : clip.setMicrosecondPosition(0);
                        break;
                    case "Q" : clip.close();
                        break;
                    default:
                        System.out.println("Not a valid Response");
                }
            }


            scan.close();
        } catch (Exception e) {
            System.out.println("Exception encountered " + e);
        }
    }
}
