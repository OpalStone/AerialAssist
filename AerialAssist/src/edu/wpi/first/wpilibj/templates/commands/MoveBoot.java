/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

/**
 *
 * @author OpalStone
 */
class MoveBoot extends CommandBase {
    double timeOut;
    double speed;

    public MoveBoot(double speed, double timeout) {
        requires(boot);
        timeOut = timeout;
        this.speed = speed;
    }

    protected void initialize() {
        setTimeout(timeOut);
    }

    protected void execute() {
        while(!isTimedOut()) {
            System.out.println("Hammer at " + speed + " during stage " + KickBall.i);
            boot.kickBall(speed);
        }
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
        end();
    }

}