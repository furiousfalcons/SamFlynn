package org.usfirst.frc4328.SamFlynn.commands;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import org.usfirst.frc4328.SamFlynn.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RecordAuto extends Command {

	 ArrayList<Double> yVals = new ArrayList<Double>();
     ArrayList<Double> zVals = new ArrayList<Double>();
     ArrayList<Double> elevatorVals = new ArrayList<Double>();
     ArrayList<Boolean> intakeVals = new ArrayList<Boolean>();
     ArrayList<Boolean> spitVals = new ArrayList<Boolean>();
     
     PrintWriter printWriter;
     String fileName;
	
    public RecordAuto() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    	requires(Robot.elevator);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	fileName = "AutoLL.txt";
    	
    	 try {
			printWriter = new PrintWriter(fileName, "UTF-8");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	yVals.add(Robot.oi.driver1.getY());
    	zVals.add(Robot.oi.driver1.getTwist());
    	elevatorVals.add(Robot.oi.driver2.getY());
    	intakeVals.add(Robot.oi.suckCubeBoi.get());
    	spitVals.add(Robot.oi.ejectButton.get());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	printWriter.println(yVals);
    	printWriter.println(zVals);
    	printWriter.println(elevatorVals);
    	printWriter.println(intakeVals);
    	printWriter.println(spitVals);
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
