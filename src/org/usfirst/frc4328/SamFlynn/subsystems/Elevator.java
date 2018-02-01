package org.usfirst.frc4328.SamFlynn.subsystems;

import org.usfirst.frc4328.SamFlynn.Robot;

import org.usfirst.frc4328.SamFlynn.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Elevator extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void controlZ(){
    	RobotMap.frontElevator.set(Robot.oi.driver2.getY());
    }
}

