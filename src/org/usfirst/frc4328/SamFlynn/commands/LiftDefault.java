package org.usfirst.frc4328.SamFlynn.commands;

import org.usfirst.frc4328.SamFlynn.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LiftDefault extends Command {

    public LiftDefault() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.lift);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(Robot.oi.backLiftButtonD2.get())
    	Robot.lift.moveLift();
    	
    	if(Robot.oi.backWinchButton.get()){
    		Robot.lift.climb();
    	}
    }
    

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return !(Robot.oi.backLiftButtonD2.get() || Robot.oi.backWinchButton.get());
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.lift.stopLift();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
