/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package surfsup;

import environment.ApplicationStarter;
import environment.Environment;
import image.ResourceTools;
import java.awt.Dimension;
import java.awt.Image;
import audio.AudioPlayer;

/**
 *
 * @author user
 */
public class SurfsUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        start();
    }
    
    public static void start(){
        System.out.println("Surf's Up!");





         String[] args =  new String[0];
       //NOTE: you can change the string below to change the window title
       String appName = "Surfs Up!";
       //NOTE: you can change the numbers below (800, 600) to change the size of the window
       Dimension appSize = new Dimension(400, 700);
       
       // Get image for background
       // Image background = ResourceTools.loadImageFromResource("resource/grass.jpg");    
       
    //   Image background = ResourceTools.loadImageFromResource("resources/sammy.jpg");
       Image background = ResourceTools.loadImageFromResource("resources/wave.jpeg");
       
       
       

       // NOTE: you MUST create a new environment that using the "xxxxEnvironment" class from your application,
       // i.e. it will almost certainly NOT be called "SnakeBiteEnvironment", but rather
       // something like "SpaceEnvironment"
       Environment environment = new SurfEnvironment();
       
       ApplicationStarter.run(args, appName, appSize, environment);  
       

    }
}
