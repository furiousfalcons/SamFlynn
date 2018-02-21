package org.usfirst.frc4328.SamFlynn.commands;

import org.usfirst.frc4328.SamFlynn.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RotateUsingGyro extends Command {

	double speed;
	double degree;
	
    public RotateUsingGyro(double degree, double speed) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    	this.speed = speed;
    	this.degree = degree;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.driveTrain.resetGyro();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(degree > 0)
    		Robot.driveTrain.normalDrive(0, speed);
    	else
    		Robot.driveTrain.normalDrive(0, -speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(degree > 0)
    		return Robot.driveTrain.getGyro() >= degree;
        
        else
        	return Robot.driveTrain.getGyro() <= degree;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
