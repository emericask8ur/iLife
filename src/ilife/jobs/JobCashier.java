
package ilife.jobs;

import ilife.Player;
import javax.swing.JOptionPane;

/**
 *
 * @author beast
 */
public class JobCashier extends Job {

    @Override
    public void doJob(Player player) {
        player.addMoney(getWage());
        JOptionPane.showMessageDialog(null, "You have finished working");
    }

    @Override
    public int getWage() {
        return 17;
    }
    
    @Override
    public String getName() {
        return "Cashier";
    }
    
}
