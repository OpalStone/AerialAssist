
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
//import org.usfirst.frc3946.UltimateAscent.ThreadedPi;
//import org.usfirst.frc3946.UltimateAscent.commands.PrintThreadPiData;

/**
 *
 * @author Gustave Michel
 */
public class ThreadberryPi extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    ThreadberryPi raspberryPi;
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
//        setDefaultCommand(new PrintThreadPiData());
    }
    
    /**
     * Start getting Data from Pi
     */
    public void startPi() {
//        raspberryPi.start();
    }
    
    /**
     * Stop getting Data from Pi
     */
    public void stopPi() {
//        raspberryPi.stop();
    }
    
    /**
     * Checks if Pi thread is running
     * @return status of Pi
     */
    public boolean isEnabled() {
        return raspberryPi.isEnabled();
    }
    
    /**
     * Checks Connection of Pi
     * @return status of Pi
     */
    public boolean isConnected() {
        return raspberryPi.isConnected();
    }
    
    /**
     * Get Offset from center from Pi
     * @return Offset from Center
     */
    public int getOffset() {
       return raspberryPi.getOffset();
    }
    
    /**
     * Get Distance from goal from Pi
     * @return Distance from goal
     */
    public int getDistance() {
       return raspberryPi.getDistance();
    }
    
    public String getFound() {
       return raspberryPi.getFound();
    }
    
    public String getHot() {
       return raspberryPi.getHot();
    }
    
    /**
     * Get Timestamp from last received Data
     * @return Timestamp from Data
     */
    public double getTime() {
       return raspberryPi.getTime();
    }
    
    public boolean getReport() {
       return raspberryPi.getReport();
    }
      
    /**
     * Constructor, starts Pi Thread
     */
    public ThreadberryPi() {
        super();
//        raspberryPi = new ThreadPi();
//        startPi();
    }
}
//        System.out.println(this.getClass().getName()+" Initialized");/*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
 
//package edu.wpi.first.wpilibj.templates;

/**
 *
 * @author AJ
 */
