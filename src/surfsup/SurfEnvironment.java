/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package surfsup;

import audio.AudioPlayer;
import environment.ApplicationStarter;
import environment.Environment;
import image.ResourceTools;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author MaxDavies
 */
public class SurfEnvironment extends Environment implements ConfigurationHandler {

    public SurfEnvironment(Image background) {
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

    private void startLevelOne() {
        Image background = ResourceTools.loadImageFromResource("resources/wave.jpeg");
        Environment environment = new SurfEnvironment(background);

        ApplicationStarter.run(new String[0], "Surfs Up!", new Dimension(400, 700), environment);
    }

    @Override
    public void handleConfig(Configuration configuration) {
        if (configuration.getSong() == "Wipeout") {
            System.out.println("WIPE OUT!!!!!!!!!!!!");
        }
        System.out.println("Config received");
    }

    public void displayMenu() {
        JDialog dialog;
        dialog = new JDialog();

        dialog.setModal(true);
        dialog.setTitle("Surf's Up Configuration");

        GameMenu gameMenu = new GameMenu();
        gameMenu.setConfigurationHandler(this);
        
        dialog.add(gameMenu);
        dialog.setAlwaysOnTop(true);

        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dialog.setSize(new Dimension(400, 600));
        dialog.setVisible(true);

    }
}
