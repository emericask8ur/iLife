/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * House.java
 *
 * Created on Dec 31, 2011, 12:06:49 AM
 */
package ilife;

import ilife.images.PlayerIcon;
import java.awt.Graphics;

/**
 *
 * @author beast
 */
public class House extends javax.swing.JPanel {

    /** Creates new form House */
    public House() {
        initComponents();
    }

    private PlayerIcon icon = PlayerIcon.House;
    public void paint(Graphics g) {
        g.drawImage(this.icon.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
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
