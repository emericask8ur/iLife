/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ilife.images;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author emericask8ur
 */
public enum PlayerIcon {
    LEFT("iconLeft.png"),
    RIGHT("iconsRight.png"),
    UPDOWN("iconsUp_Down.png"),
    Down("Down.png"),
    Market("Market.png"),
    House("House.png"),
    COOK("Cook.png"); //Wait can I just add it like this
    private final String path;
    private Image image;
    private PlayerIcon(final String path) {
            this.path = path;
    }
    public Image getImage() {
        if (this.image == null) {
            this.image = new ImageIcon(getClass().getResource("/ilife/images/" + this.path)).getImage();
        }
        return this.image;
    }
    
}
