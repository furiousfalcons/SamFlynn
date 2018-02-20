package org.usfirst.frc4328.SamFlynn.subsystems;

import org.usfirst.frc4328.SamFlynn.Robot;
import org.usfirst.frc4328.SamFlynn.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CubeManipulator extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	private static SpeedController cubeIntake = RobotMap.cubeIntake;
	private static SpeedController intakeIncline = RobotMap.intakeIncline;

	private static DigitalInput cubeLimit = RobotMap.cubeLimit;

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}

	public void beginIntake() {
		cubeIntake.set(0.4);
	}

	public void spitCube() {
		cubeIntake.set(-0.4);
	}

	public void stopIntake() {
		cubeIntake.set(0.0);
	}

	public boolean getCubeLimit() {
		return cubeLimit.get();
	}
}
