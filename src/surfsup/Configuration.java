/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package surfsup;

/**
 *
 * @author MaxDavies
 */
public class Configuration {
   
    public static enum GameLevel {HONOLULU, LONG_BEACH}
    
    //<editor-fold defaultstate="collapsed" desc="Properties">
    private String song = "";
    private GameLevel level = GameLevel.HONOLULU;
    
    /**
     * @return the song
     */
    public String getSong() {
        return song;
    }
    
    /**
     * @param song the song to set
     */
    public void setSong(String song) {
        this.song = song;
    }
    
    /**
     * @return the level
     */
    public GameLevel getLevel() {
        return level;
    }
    
    /**
     * @param level the level to set
     */
    public void setLevel(GameLevel level) {
        this.level = level;
    }
    //</editor-fold>
}
