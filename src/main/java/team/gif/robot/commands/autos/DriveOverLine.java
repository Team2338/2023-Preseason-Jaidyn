package team.gif.robot.commands.autos;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import team.gif.robot.commands.drivetrain.DriveArcade;

public class DriveOverLine extends SequentialCommandGroup {
    public DriveOverLine() {
        if (Timer.getMatchTime() <= 5.0) {
            new Drive().schedule();
        }
    }
}
