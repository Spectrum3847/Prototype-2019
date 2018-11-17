package frc.robot;

import frc.lib.controllers.SpectrumXboxController;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

public class OI {
	public static SpectrumXboxController driverController;
	public static SpectrumXboxController operatorController;
	
	public OI() {
		
		driverController = new SpectrumXboxController(0, .02, .02);
		operatorController = new SpectrumXboxController(1, .10, .10);

        /* Example
        driverController.rightBumper.whileHeld(new HighGear());
		driverController.leftBumper.whileHeld(new SetArmExchangePos()); */

    }

}