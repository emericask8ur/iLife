
package ilife.jobs;

import ilife.Player;

/**
 *
 * @author beast
 */
public abstract class Job {
    
    public abstract void doJob(Player player);
    public abstract int getWage();
    public abstract String getName();
    
}
