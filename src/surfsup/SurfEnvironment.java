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

    public SurfEnvironment(Image background){
        super(background);
    }
    
    @Override
    public void initializeEnvironment() {
        System.out.println("Init");
//               AudioPlayer.play(SurfEnvironment.class.getResourceAsStream("/resources/wave_sound.wav"), 1);
               AudioPlayer.play("/resources/wave_sound.wav");

    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_W) {
            System.out.println("W pressed!!!");
        }

        if (ke.getKeyCode() == KeyEvent.VK_A) {
            System.out.println("A pressed!!!");
        }

        if (ke.getKeyCode() == KeyEvent.VK_S) {
            System.out.println("S pressed!!!");
        }

        if (ke.getKeyCode() == KeyEvent.VK_D) {
            System.out.println("D pressed!!!");
        }

        if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            System.out.println("Down arrow pressed!!!");
        }

        if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Left pressed!!!");
        }

        if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right pressed!!!");
        }

        if (ke.getKeyCode() == KeyEvent.VK_UP) {
            System.out.println("Up pressed!!!");
        }
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
        
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
        
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        
        
    }
}
