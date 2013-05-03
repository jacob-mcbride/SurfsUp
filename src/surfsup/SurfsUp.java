/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package surfsup;

import environment.ApplicationStarter;
import image.ResourceTools;
import java.awt.Dimension;
import java.awt.Image;


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


        
        startLevelOne();


//         String[] args =  new String[0];
//       //NOTE: you can change the string below to change the window title
//       String appName = "Surfs Up!";
//       //NOTE: you can change the numbers below (800, 600) to change the size of the window
//       Dimension appSize = new Dimension(400, 700);
//       
//       // Get image for background
//       // Image background = ResourceTools.loadImageFromResource("resource/grass.jpg");    
//       
//    //   Image background = ResourceTools.loadImageFromResource("resources/sammy.jpg");
//       Image background = ResourceTools.loadImageFromResource("resources/wave.jpeg");
//       
//       
//       
//
//       // NOTE: you MUST create a new environment that using the "xxxxEnvironment" class from your application,
//       // i.e. it will almost certainly NOT be called "SnakeBiteEnvironment", but rather
//       // something like "SpaceEnvironment"
//       Environment environment = new SurfEnvironment(background);
//       
//       ApplicationStarter.run(args, appName, appSize, environment);
       
       

    }

//    private static void displayMenu() {
//        JDialog dialog;
//        dialog = new JDialog();
//
//        dialog.setModal(true);
//        dialog.setTitle("Surf's Up Configuration");
//
//        GameMenu gameMenu = new GameMenu();
//        gameMenu.setConfigurationHandler(this);
//        
//        dialog.add(gameMenu);
//        dialog.setAlwaysOnTop(true);
//
//        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        dialog.setSize(new Dimension(400, 600));
//        dialog.setVisible(true);
//
//    }


    private static void startLevelOne() {
       Image background = ResourceTools.loadImageFromResource("resources/wave.jpeg");
       SurfEnvironment surfEnvironment = new SurfEnvironment(background);
       
       surfEnvironment.displayMenu();
       
       ApplicationStarter.run(new String[0], "Surfs Up!", new Dimension(400, 700), surfEnvironment);
    }
}
