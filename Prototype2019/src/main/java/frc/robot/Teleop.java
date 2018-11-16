package frc.robot;

import edu.wpi.first.wpilibj.command.Scheduler;

/**
 * The Driver Control period of the competition
 */
public class Teleop {
    public static void init() {
        Scheduler.getInstance().removeAll();
    }

    
    public static void periodic() {
        Robot.drive.arcadeDrive(OI.driverController.leftStick.getY(), OI.driverController.rightStick.getX());
        System.out.println("Left: " + Robot.left.get() + " Right: " + Robot.right.get());
    }

}