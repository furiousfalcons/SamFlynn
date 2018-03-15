package org.usfirst.frc4328.SamFlynn.subsystems;

import org.usfirst.frc4328.SamFlynn.Robot;
import org.usfirst.frc4328.SamFlynn.RobotMap;
import org.usfirst.frc4328.SamFlynn.commands.ElevatorDefault;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Elevator extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	private final SpeedController frontElevator = RobotMap.frontElevator;
	private final DigitalInput frontTop = RobotMap.frontTop;

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new ElevatorDefault());
	}

	public void controlZ() {
		if (-Robot.oi.driver2.getY() < 0.0 && frontTop.get()) {
			// Don't lift elevator if limit switch is pressed and you're trying to move the
			// elevator up
		} else {
			frontElevator.set(-Robot.oi.driver2.getY());
		}
	}
	
	public void stopElevator() {
		frontElevator.set(0.0);
	}
}
