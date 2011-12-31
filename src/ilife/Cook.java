/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Cook.java
 *
 * Created on Dec 30, 2011, 9:22:07 PM
 */
package ilife;

import ilife.images.PlayerIcon;
import java.awt.Graphics;

public class Cook extends javax.swing.JPanel {

    /** Creates new form Cook */
    public Cook() {
        initComponents();
    }
    private PlayerIcon icon = PlayerIcon.COOK;
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
