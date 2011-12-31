

package ilife;

import ilife.images.PlayerIcon;
import ilife.jobs.Job;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

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
    private int x, y;
    public void setIcon(PlayerIcon icon) {
        if (this.icon != icon) {
            this.icon = icon;
            this.invalidate();
        }
    }
    public void paint(Graphics g) {
        g.drawImage(this.icon.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
    }
    
    private double money = 0;
    public double getMoney() {
        return this.money;
    }
    public void setMoney(double value) {
        this.money = value;
        Main.instance.setDisplayMoney("$" + value);//theres a workaround
    }
    public void addMoney(double value) {
        this.setMoney(this.getMoney() + value);
    }
    
    //display a message to this player
    public void sendMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    

    public boolean collides(JComponent with) {
        return this.getBounds().intersects(with.getBounds());
    }
        //Movement functions
    public void setX(int x) {
        this.setLocation(x, this.getY());
        this.x = x;
    }
    public void setY(int y) {
        this.setLocation(this.getX(), y);
        this.y = y;
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
        this.setIcon(PlayerIcon.Down);
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



