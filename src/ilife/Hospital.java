
package ilife;

import ilife.images.PlayerIcon;
import ilife.jobs.Job;
import ilife.jobs.JobNurse;
import java.awt.Graphics;

/**
 *
 * @author beast
 */
public class Hospital extends javax.swing.JPanel {

    /** Creates new form Hospital */
    public Hospital() {
        initComponents();
    }
        private PlayerIcon icon = PlayerIcon.Hospital;
    public void paint(Graphics g) {
        g.drawImage(this.icon.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
    }
    private Job job = new JobNurse();
    public Job getJob() {
        return this.job;
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
