package frc.robot;

import edu.wpi.first.wpilibj.command.Scheduler;

/**
 * The Driver Control period of the competition
 */
public class Autonomous {
    public static void init() {
        Scheduler.getInstance().removeAll();
    }

    
    public static void periodic() {
    }
}