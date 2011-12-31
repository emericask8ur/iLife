
/*
 * Main.java
 *
 * Created on Dec 30, 2011, 6:51:29 PM
 * Created by Emericask8ur and Bergerkiller
 * Commit 4
 * Todo: Handle More Jobs, Foods. New Buildings, Health
 */
package ilife;

import ilife.sounds.Sound;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame implements KeyListener{
    int click = 0;

    public Main() {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        cook1 = new ilife.Cook();
        HealthText = new javax.swing.JLabel();
        HealthInt = new javax.swing.JLabel();
        FunText = new javax.swing.JLabel();
        FunInt = new javax.swing.JLabel();
        SleepText = new javax.swing.JLabel();
        SleepInt = new javax.swing.JLabel();
        Market = new ilife.Market();
        BuyFoodText = new javax.swing.JLabel();
        JobText = new javax.swing.JLabel();
        JobInt = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        DegreeText = new javax.swing.JLabel();
        DegreeInt = new javax.swing.JLabel();
        House = new ilife.House();
        player = new ilife.Player();
        MoneyText = new javax.swing.JLabel();
        MoneyInt = new javax.swing.JLabel();
        JobLoc = new javax.swing.JLabel();
        LocInt = new javax.swing.JLabel();
        hospital1 = new ilife.Hospital();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 254, 254));

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

        HealthText.setFont(new java.awt.Font("Tahoma", 0, 18));
        HealthText.setText("Health:");

        HealthInt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HealthInt.setText("100");

        FunText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FunText.setText("Fun:");

        FunInt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FunInt.setText("100");

        SleepText.setFont(new java.awt.Font("Tahoma", 0, 18));
        SleepText.setText("Energy:");

        SleepInt.setFont(new java.awt.Font("Tahoma", 0, 18));
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

        BuyFoodText.setFont(new java.awt.Font("Tahoma", 0, 12));
        BuyFoodText.setText("Buy Food");

        JobText.setFont(new java.awt.Font("Tahoma", 0, 18));
        JobText.setText("Job:");

        JobInt.setFont(new java.awt.Font("Tahoma", 0, 18));
        JobInt.setText("None");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        DegreeText.setFont(new java.awt.Font("Tahoma", 0, 18));
        DegreeText.setText("Degree:");

        DegreeInt.setFont(new java.awt.Font("Tahoma", 0, 18));
        DegreeInt.setText("None");

        javax.swing.GroupLayout HouseLayout = new javax.swing.GroupLayout(House);
        House.setLayout(HouseLayout);
        HouseLayout.setHorizontalGroup(
            HouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );
        HouseLayout.setVerticalGroup(
            HouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 245, Short.MAX_VALUE)
        );

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

        MoneyText.setFont(new java.awt.Font("Tahoma", 0, 18));
        MoneyText.setForeground(new java.awt.Color(0, 153, 51));
        MoneyText.setText("Money $");

        MoneyInt.setFont(new java.awt.Font("Tahoma", 0, 18));
        MoneyInt.setText("0");

        JobLoc.setFont(new java.awt.Font("Tahoma", 0, 18));
        JobLoc.setText("Job Location:");

        LocInt.setFont(new java.awt.Font("Tahoma", 0, 18));
        LocInt.setText("None");

        javax.swing.GroupLayout hospital1Layout = new javax.swing.GroupLayout(hospital1);
        hospital1.setLayout(hospital1Layout);
        hospital1Layout.setHorizontalGroup(
            hospital1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        hospital1Layout.setVerticalGroup(
            hospital1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1081, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SleepText)
                        .addGap(18, 18, 18)
                        .addComponent(SleepInt))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HealthText)
                            .addComponent(FunText))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FunInt)
                            .addComponent(HealthInt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(64, 64, 64)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MoneyText)
                        .addGap(18, 18, 18)
                        .addComponent(MoneyInt, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                        .addGap(709, 709, 709))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JobLoc)
                        .addGap(18, 18, 18)
                        .addComponent(LocInt, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(675, 675, 675))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JobText, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JobInt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DegreeText)
                                .addGap(18, 18, 18)
                                .addComponent(DegreeInt)))
                        .addContainerGap(716, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Market, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 804, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cook1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BuyFoodText, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(hospital1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(262, 262, 262)
                .addComponent(House, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(player, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(510, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Market, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cook1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BuyFoodText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(120, 120, 120)
                        .addComponent(player, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(House, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(HealthText, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(HealthInt))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(FunText)
                                    .addComponent(FunInt))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SleepText)
                                    .addComponent(SleepInt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(105, 105, 105))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JobText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JobInt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DegreeText)
                            .addComponent(DegreeInt))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JobLoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LocInt))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MoneyText)
                            .addComponent(MoneyInt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(106, 106, 106))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(269, Short.MAX_VALUE)
                .addComponent(hospital1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(318, 318, 318))
        );

        player.addKeyListener(this);
        player.setFocusable(true);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     * 
     */
    public static Main instance;
    public static void main(String args[]) {
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
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                instance = new Main();
                instance.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BuyFoodText;
    private javax.swing.JLabel DegreeInt;
    private javax.swing.JLabel DegreeText;
    private javax.swing.JLabel FunInt;
    private javax.swing.JLabel FunText;
    private javax.swing.JLabel HealthInt;
    private javax.swing.JLabel HealthText;
    private ilife.House House;
    private javax.swing.JLabel JobInt;
    private javax.swing.JLabel JobLoc;
    private javax.swing.JLabel JobText;
    private javax.swing.JLabel LocInt;
    private ilife.Market Market;
    private javax.swing.JLabel MoneyInt;
    private javax.swing.JLabel MoneyText;
    private javax.swing.JLabel SleepInt;
    private javax.swing.JLabel SleepText;
    private ilife.Cook cook1;
    private ilife.Hospital hospital1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
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
        if(e.getKeyCode()== KeyEvent.VK_0){
            click = 0;
            DegreeInt.setText("Associate");
        }
        //Interactions
         if(player.collides(jSeparator1)){
            int sub = player.getLocation().x - 1;
              int suby = player.getLocation().y - 1;
            player.setLocation(sub, 405);
            
        }
        if (player.collides(cook1) && e.getKeyCode()==KeyEvent.VK_SPACE){
            String money = MoneyInt.getText();
            int setMoney = Integer.parseInt(money);
            //Food Money
            int $steak = setMoney - 12;
            int $corn = setMoney - 6;
            int $chick = setMoney - 7;
             int $cookie = setMoney - 2;
             int $pork = setMoney - 11;
            String type = JOptionPane.showInputDialog("Type What you Want to Buy: Steak: $12 | Corn: $6 | Chicken: $7 | Cookie: $2 | Pork: $11");
            while(true){
            if(type.equalsIgnoreCase("steak") && setMoney >= 12){
                Sound.BURP.play();
                MoneyInt.setText("" + $steak);
                //Todo Handle Health
            } else {
                JOptionPane.showMessageDialog(null, "You cannot afford this Item!");
                                                break;
            }
            if(type.equalsIgnoreCase("corn") && setMoney >= 6){
                Sound.BURP.play();
                MoneyInt.setText("" + $corn);
                                //Todo Handle Health
            } else {
                JOptionPane.showMessageDialog(null, "You cannot afford this Item!");
                                                break;
                
            }
            if(type.equalsIgnoreCase("chicken") && setMoney >= 7){
                Sound.BURP.play();
                MoneyInt.setText( "" + $chick);
                                //Todo Handle Health
            } else {
                JOptionPane.showMessageDialog(null, "You cannot afford this Item!");
                                                break;
            }
            if(type.equalsIgnoreCase("cookie") && setMoney >= 2){
                Sound.BURP.play();
                MoneyInt.setText( "" + $cookie);
                                //Todo Handle Health
            } else {
                JOptionPane.showMessageDialog(null, "You cannot afford this Item!");
                                                break;
            }
            if(type.equalsIgnoreCase("pork") && setMoney >=11){
                Sound.BURP.play();
                MoneyInt.setText( "" + $pork);
                                //Todo Handle Health
            } else {
                JOptionPane.showMessageDialog(null, "You cannot afford this Item!");
                                                break;
            }
            }
        }
        //Market
        if(player.collides(Market) && e.getKeyCode()==KeyEvent.VK_SPACE){
            if(!JobInt.getText().equalsIgnoreCase("Cashier")){
            String input = JOptionPane.showInputDialog("Work as a Cashier for $17 a Day? Yes/No");
            if(input.equalsIgnoreCase("yes")){
                JOptionPane.showMessageDialog(null, "You got the job!");
                JobInt.setText("Cashier");
            }//!JobInt
            if(input.equalsIgnoreCase("no")){
                
            }
            }
            if(click==2){
                JOptionPane.showMessageDialog(null, "You already worked today! Sleep!");
            } else {
                click++;
            }
            if(!(click==2) && JobInt.getText().equalsIgnoreCase("Cashier")){
                Market.getJob().doJob(player);
            }
        }//End Market
        if(player.collides(hospital1) && e.getKeyCode()==KeyEvent.VK_SPACE){
            if(!JobInt.getText().equalsIgnoreCase("Nurse")){
                String input = JOptionPane.showInputDialog("Work as a Nurse for $25 a Day? Yes/No");
                if(DegreeInt.getText().equals("Associate")){
                    if(input.equalsIgnoreCase("yes")){
                 JOptionPane.showMessageDialog(null, "You got the job!");
                     JobInt.setText("Nurse");
                    }
                   if(input.equalsIgnoreCase("no") || input.equals(null)){
                   }
                } else {
                    JOptionPane.showMessageDialog(null, "You need a Associate Degree for this!");
                 }
                if(JobInt.getText().equals("Nurse") && !(click==2)){
                    hospital1.getJob().doJob(player);
                    Sound.Typing.play();
                }
               if(click==2){
                JOptionPane.showMessageDialog(null, "You already worked today! Sleep!");
            } else {
                click++;
            }
            }
        }//Jobs Hospital
        if(player.collides(House) && e.getKeyCode()==KeyEvent.VK_SPACE){
                        Sound.Bells.play();
            click = 0;
            Sound.Bells.play();
        }
    }
    
    public void setDisplayMoney(String text) {
        this.MoneyInt.setText(text);
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
    }
}
