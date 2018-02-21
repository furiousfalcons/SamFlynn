package org.usfirst.frc4328.SamFlynn.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoLR extends CommandGroup {

    public AutoLR() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	
    	//drive forwards
    	addSequential(new DriveForwards(150.0,0.6));
    	//turn left
    	addSequential(new RotateUsingGyro(-90,0.6));
    	//drive forwards
    	addSequential(new DriveForwards(350.0,0.6));
    	//turn left
    	addSequential(new RotateUsingGyro(-90, 0.6));
    	//drive forwards and drop cube
    	addSequential(new DriveForwards(150.0,0.6));
    	addSequential(new EjectPowerCube());
    }
}
