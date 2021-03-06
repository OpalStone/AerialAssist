/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;




/**
 *
 * @author AJ
 */
public class MecanumDrive extends CommandBase {
    double X;
    double Y;
    double throttle;
//    double xOld;
//    double yOld;
//    double throttleOld;
//    double dx;
//    double dy;
//    double dt;
    
    public MecanumDrive() {
        requires(driveTrain);
    }
    
    protected void initialize(){
    }

    protected void execute() {
        //here we already have to access the io object. 
        //read the up/down and left/right from io.
        //then pass those values to the mecanum drive function.
        
        SmartDashboard.putNumber("[MC] X", oi.getXbox().getX(GenericHID.Hand.kLeft));
        SmartDashboard.putNumber("[MC] Y", oi.getXbox().getY(GenericHID.Hand.kLeft));
        SmartDashboard.putNumber("[MC] Theta", oi.getXbox().getThrottle());
        X = oi.getXbox().getX(GenericHID.Hand.kLeft);
        if (java.lang.Math.abs(X) <= 0.25) {
            X = 0.0;
        } else {
        }
        Y = oi.getXbox().getY(GenericHID.Hand.kLeft);
        if (java.lang.Math.abs(Y) <= 0.25) {
            Y = 0.0;
        }
        throttle = oi.getXbox().getThrottle();
        if (java.lang.Math.abs(throttle) <= 0.25) {
            throttle = 0.0;          
        }
//        
//        dx = 10.0*(X - xOld);
//        dy = 10.0*(Y - yOld);
//        dt = 10.0*(throttle - throttleOld);
//        for(double i = 1.0; i < dx && i < dy && i < dt; i += 1.0) {
//            setTimeout(.4);
//            while(!isTimedOut()){
        driveTrain.mecanumDrive(X, Y, throttle, gyro.getAngle());
//            }
//        }
    }

    protected boolean isFinished() {
//        xOld = X;
//        yOld = Y;
//        throttleOld = throttle;
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
   
    
}
