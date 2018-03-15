package org.usfirst.frc4328.SamFlynn.subsystems;

import org.usfirst.frc4328.SamFlynn.Robot;
import org.usfirst.frc4328.SamFlynn.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Winch extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	private final SpeedController backWinch = RobotMap.backWinch;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void moveWinch(){
    	backWinch.set(Robot.oi.driver2.getY());
    }

	public void stopWinch() {
		// TODO Auto-generated method stub
		
	}
    
}

