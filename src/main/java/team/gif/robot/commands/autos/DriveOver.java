package team.gif.robot.commands.autos;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;

public class DriveOver extends SequentialCommandGroup {
    public DriveOver() {
        addCommands(
            new AutoDrive(10)
            //new WaitCommand(3).andThen(new StopAutoDrive())
        );
    }
}
