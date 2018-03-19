package org.usfirst.frc4328.SamFlynn.commands;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.usfirst.frc4328.SamFlynn.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class PlaybackAuto extends Command {

	 ArrayList<Double> yVals = new ArrayList<Double>();
     ArrayList<Double> zVals = new ArrayList<Double>();
     ArrayList<Double> elevatorVals = new ArrayList<Double>();
     ArrayList<Boolean> intakeVals = new ArrayList<Boolean>();
     ArrayList<Boolean> spitVals = new ArrayList<Boolean>();
	
     
	String fileName;
	String line = null;

	public PlaybackAuto() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.driveTrain);
		requires(Robot.elevator);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
    	// The name of the file to open.
        String fileName = "AutoLL.txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            line = bufferedReader.readLine();
            

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }

	

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {

	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}
}
