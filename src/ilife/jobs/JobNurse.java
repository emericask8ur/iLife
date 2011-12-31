
package ilife.jobs;

import ilife.Player;
import javax.swing.JOptionPane;


public class JobNurse extends Job{

    @Override
    public void doJob(Player player) {
        player.addMoney(getWage());
        JOptionPane.showMessageDialog(null, "You have finished working");
    }

    @Override
    public int getWage() {
        return 25;
    }
    
    @Override
    public String getName() {
        return "Nurse";
    }
    
}
