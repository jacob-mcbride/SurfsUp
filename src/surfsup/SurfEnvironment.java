/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package surfsup;

import audio.AudioPlayer;
import environment.Environment;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author MaxDavies
 */
public class SurfEnvironment extends Environment {

<<<<<<< HEAD
    public SurfEnvironment(Image background){
        super(background);
    }
=======
<<<<<<< HEAD
>>>>>>> Hi
    
    @Override
    public void initializeEnvironment() {
        System.out.println("Init");
//               AudioPlayer.play(SurfEnvironment.class.getResourceAsStream("/resources/wave_sound.wav"), 1);
               AudioPlayer.play("/resources/wave_sound.wav");

=======
    @Override
    public void initializeEnvironment() {
>>>>>>> Hi
    }

    @Override
    public void timerTaskHandler() {
<<<<<<< HEAD
=======
<<<<<<< HEAD

       
=======
>>>>>>> Hi
>>>>>>> Hi
    }

    @Override
    public void keyPressedHandler(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_W) {
            System.out.println("W pressed!!!");
<<<<<<< HEAD
        }

        if (ke.getKeyCode() == KeyEvent.VK_A) {
            System.out.println("A pressed!!!");
        }

        if (ke.getKeyCode() == KeyEvent.VK_S) {
            System.out.println("S pressed!!!");
        }

        if (ke.getKeyCode() == KeyEvent.VK_D) {
=======
        } else if (ke.getKeyCode() == KeyEvent.VK_A) {
            System.out.println("A pressed!!!");
        } else if (ke.getKeyCode() == KeyEvent.VK_S) {
            System.out.println("S pressed!!!");
        }else  if (ke.getKeyCode() == KeyEvent.VK_D) {
>>>>>>> Hi
            System.out.println("D pressed!!!");
<<<<<<< HEAD
        }
<<<<<<< HEAD

        if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            System.out.println("Down arrow pressed!!!");
        }

        if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
=======
            
            if (ke.getKeyCode() == KeyEvent.VK_DOWN){
=======
        }else if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
>>>>>>> Hi
            System.out.println("Down arrow pressed!!!");
        }else if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
>>>>>>> Hi
            System.out.println("Left pressed!!!");
        }

        if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right pressed!!!");
        }

        if (ke.getKeyCode() == KeyEvent.VK_UP) {
            System.out.println("Up pressed!!!");
        }
<<<<<<< HEAD
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
        
=======
<<<<<<< HEAD
        }
        

        

       

    

    @Override
    public void keyReleasedHandler(KeyEvent e) {

       

=======


    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
>>>>>>> Hi
>>>>>>> Hi
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
<<<<<<< HEAD
        
=======
<<<<<<< HEAD

=======
>>>>>>> Hi
>>>>>>> Hi
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
<<<<<<< HEAD
        
        
=======
<<<<<<< HEAD

=======
>>>>>>> Hi
>>>>>>> Hi
    }
}
