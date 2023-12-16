package team.gif.robot.commands.autos;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import team.gif.robot.Robot;

public class StopAutoDrive extends CommandBase {

    public StopAutoDrive() {
        super();
        addRequirements(Robot.drivetrain); // uncomment
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        System.out.println("Running Autos");
    }

    // Called every time the scheduler runs (~20ms) while the command is scheduled
    @Override
    public void execute() {
        double forwardBackward = 0;
        double rot = 0;
        System.out.println(Timer.getMatchTime());
        Robot.drivetrain.driveArcade(-rot, forwardBackward);
    }

    // Return true when the command should end, false if it should continue. Runs every ~20ms.
    @Override
    public boolean isFinished() {
//        return (Timer.getMatchTime()) < 2;
        return false;
    }

    // Called when the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {}
}
