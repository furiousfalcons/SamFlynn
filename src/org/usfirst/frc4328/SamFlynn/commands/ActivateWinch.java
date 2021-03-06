package org.usfirst.frc4328.SamFlynn.commands;

import org.usfirst.frc4328.SamFlynn.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ActivateWinch extends Command {

    public ActivateWinch() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.winch);
    	//possible fix to glitching elevator
    	requires(Robot.elevator);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.winch.moveWinch();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.winch.stopWinch();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
