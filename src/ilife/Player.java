/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Player.java
 *
 * Created on Dec 30, 2011, 8:59:47 PM
 */
package ilife;

import ilife.images.PlayerIcon;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author beast
 */
public class Player extends javax.swing.JPanel {
    //

    /** Creates new form Player */
    public Player() {
        initComponents();
    }
    
    private PlayerIcon icon = PlayerIcon.UPDOWN;
    public void setIcon(PlayerIcon icon) {
        if (this.icon != icon) {
            this.icon = icon;
            this.invalidate();
        }
    }
    public void paint(Graphics g) {
        g.drawImage(this.icon.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
    }
    
    

    public boolean collides(JComponent with) {
        return this.getBounds().intersects(with.getBounds());
    }
    
        //Movement functions
    public void setX(int x) {
        this.setLocation(x, this.getY());
    }
    public void setY(int y) {
        this.setLocation(this.getX(), y);
    }
    public void moveLeft(int offset) {
        this.setIcon(PlayerIcon.LEFT);
        this.setX(this.getX() - offset);
    }
    public void moveRight(int offset) {
        this.setIcon(PlayerIcon.RIGHT);
        this.setX(this.getX() + offset);
    }
    public void moveUp(int offset) {
        this.setIcon(PlayerIcon.UPDOWN);
        this.setY(this.getY() - offset);
    }
    public void moveDown(int offset) {
        this.setIcon(PlayerIcon.UPDOWN);
        this.setY(this.getY() + offset); //So Slow 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}



