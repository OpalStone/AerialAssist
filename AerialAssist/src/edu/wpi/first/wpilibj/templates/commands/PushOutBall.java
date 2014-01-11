/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.subsystems.ClawWheels;

/**
 *
 * @author OpalStone
 */
public class PushOutBall extends CommandBase {
    ClawWheels clawWheels = new ClawWheels();
    
    public PushOutBall () {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires (clawWheels);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
         System.out.println("PushOutBall");
    }

    protected void execute() {
        clawWheels.set(1.0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
            return false;
        }
    }

    // Called once after isFinished returns true
    protected void end() {
        Motor.set(Relay.Value.kOff);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        pushMotor.set(Relay.Value.kOff);
    }