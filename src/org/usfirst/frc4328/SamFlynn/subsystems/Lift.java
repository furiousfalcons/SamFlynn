package org.usfirst.frc4328.SamFlynn.subsystems;

import org.usfirst.frc4328.SamFlynn.Robot;
import org.usfirst.frc4328.SamFlynn.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Lift extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	private final DigitalInput backTrigger = RobotMap.backTrigger;
	private final DigitalInput backTop = RobotMap.backTop;
	
	private final SpeedController backElevator = RobotMap.backElevator;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void moveLift() {
    	backElevator.set(-Robot.oi.driver2.getY());
    }
    
    public void stopLift() {
    	backElevator.set(0.0);
    }
}

