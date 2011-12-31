/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Main.java
 *
 * Created on Dec 30, 2011, 6:51:29 PM
 * Created by Emericask8ur and Bergerkiller
 * Commit 2
 * Todo: Handle Market , Food Buying, Jobs.
 */
package ilife;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame implements KeyListener{

    public Main() {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        player = new ilife.Player();
        cook1 = new ilife.Cook();
        HealthText = new javax.swing.JLabel();
        HealthInt = new javax.swing.JLabel();
        FunText = new javax.swing.JLabel();
        FunInt = new javax.swing.JLabel();
        SleepText = new javax.swing.JLabel();
        SleepInt = new javax.swing.JLabel();
        Market = new ilife.Market();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 254, 254));

        javax.swing.GroupLayout playerLayout = new javax.swing.GroupLayout(player);
        player.setLayout(playerLayout);
        playerLayout.setHorizontalGroup(
            playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );
        playerLayout.setVerticalGroup(
            playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cook1Layout = new javax.swing.GroupLayout(cook1);
        cook1.setLayout(cook1Layout);
        cook1Layout.setHorizontalGroup(
            cook1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        cook1Layout.setVerticalGroup(
            cook1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        HealthText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HealthText.setText("Health:");

        HealthInt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HealthInt.setText("100");

        FunText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FunText.setText("Fun:");

        FunInt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FunInt.setText("100");

        SleepText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SleepText.setText("Energy:");

        SleepInt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SleepInt.setText("100");

        javax.swing.GroupLayout MarketLayout = new javax.swing.GroupLayout(Market);
        Market.setLayout(MarketLayout);
        MarketLayout.setHorizontalGroup(
            MarketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 167, Short.MAX_VALUE)
        );
        MarketLayout.setVerticalGroup(
            MarketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 167, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1081, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HealthText)
                            .addComponent(FunText))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FunInt)
                            .addComponent(HealthInt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(SleepText)
                        .addGap(18, 18, 18)
                        .addComponent(SleepInt)))
                .addContainerGap(963, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(619, Short.MAX_VALUE)
                .addComponent(player, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(376, 376, 376))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Market, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 804, Short.MAX_VALUE)
                .addComponent(cook1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Market, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(player, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cook1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(189, 189, 189)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HealthText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HealthInt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FunText)
                    .addComponent(FunInt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SleepText)
                    .addComponent(SleepInt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        player.addKeyListener(this);
        player.setFocusable(true);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FunInt;
    private javax.swing.JLabel FunText;
    private javax.swing.JLabel HealthInt;
    private javax.swing.JLabel HealthText;
    private ilife.Market Market;
    private javax.swing.JLabel SleepInt;
    private javax.swing.JLabel SleepText;
    private ilife.Cook cook1;
    private javax.swing.JSeparator jSeparator1;
    private ilife.Player player;
    // End of variables declaration//GEN-END:variables

    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    private int speed = 15;
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()== KeyEvent.VK_W || e.getKeyCode()== KeyEvent.VK_UP){
            player.moveUp(speed);
        } else if (e.getKeyCode() == KeyEvent.VK_S || e.getKeyCode() == KeyEvent.VK_DOWN) {
            player.moveDown(speed);
        } else if (e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_LEFT) {
            player.moveLeft(speed);
        } else if (e.getKeyCode() == KeyEvent.VK_D || e.getKeyCode() == KeyEvent.VK_RIGHT) {
            player.moveRight(speed);
        }
        //Debug
        if(e.getKeyCode()==KeyEvent.VK_F6){
            System.out.println("Debug 1: " + player.getLocation());
        }//End 
        //Interactions
         if(player.collides(jSeparator1)){
            int sub = player.getLocation().x - 1;
              int suby = player.getLocation().y - 1;
            player.setLocation(sub, 405);
        }
        if (player.collides(cook1)){
           if(e.getKeyCode()==KeyEvent.VK_SPACE){
                //Todo: Handle Food Store
          }
        }
        if(player.collides(Market)){
            //ToDo: Handle Market Jobs
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}
