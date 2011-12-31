/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
