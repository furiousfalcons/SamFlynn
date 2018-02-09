package org.usfirst.frc4328.SamFlynn.commands;

import org.usfirst.frc4328.SamFlynn.Robot;
import org.usfirst.frc4328.SamFlynn.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveForwards extends Command {

//	double initialLeft;
	double initialRight;
	double distance;
	double desiredDistance;
	double speed;

	public DriveForwards(double desiredDistance, double speed) {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.driveTrain);
		this.desiredDistance = desiredDistance;
		this.speed = speed;
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		distance = 0.0;
		Robot.driveTrain.getDriveEncoder().reset();
		initialRight = Robot.driveTrain.getDriveEncoder().get();
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		distance = Robot.driveTrain.getDriveEncoder().get()-initialRight;
		Robot.driveTrain.normalDrive(speed, 0.0);
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return distance >= desiredDistance;
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.driveTrain.normalDrive(0.0,0.0);
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}
}
