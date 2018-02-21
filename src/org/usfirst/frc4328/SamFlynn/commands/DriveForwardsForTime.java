package org.usfirst.frc4328.SamFlynn.commands;

import org.usfirst.frc4328.SamFlynn.Robot;
import org.usfirst.frc4328.SamFlynn.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveForwardsForTime extends Command {

	double speed;
	double rotation;
	
    public DriveForwardsForTime(double time, double speed) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    	setTimeout(time);
    	this.speed = speed;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	rotation = 0.0;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	if(RobotMap.gyro.getAngle()>3.0) {
    		RobotMap.driveTrain.arcadeDrive(speed,-0.5);
    	}
    	if(RobotMap.gyro.getAngle()<=-3.0) {
    		RobotMap.driveTrain.arcadeDrive(speed,0.5);
    	}
    	else {
    		RobotMap.driveTrain.arcadeDrive(speed,0.0);
    	}
    	
    	
    	
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	RobotMap.driveTrain.arcadeDrive(0.0,0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
