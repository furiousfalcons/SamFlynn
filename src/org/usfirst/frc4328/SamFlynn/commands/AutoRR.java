package org.usfirst.frc4328.SamFlynn.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoRR extends CommandGroup {

    public AutoRR() {
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
    	
    	addSequential(new ResetGyro());
    	addSequential(new DriveForwardsForTime(2.3, 0.7));
    	
    	addSequential(new LiftCube(0.5,0.2));
    	addSequential(new LiftCube(0.8,0.4));
    	addParallel(new IntakePowerCube(0.3));
    	addSequential(new LiftCube(0.5,0.6));
    	addSequential(new LiftCube(0.1,0.0));
    	
    	addSequential(new EjectPowerCube(1.5));
    	
    }
}
