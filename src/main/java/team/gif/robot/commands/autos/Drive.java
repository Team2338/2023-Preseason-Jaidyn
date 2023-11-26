package team.gif.robot.commands.autos;

import edu.wpi.first.wpilibj2.command.CommandBase;
import team.gif.robot.Robot;

public class Drive extends CommandBase {
    double drivePercent;

    public Drive() {
        super();
        //addRequirements(Robot.climber); // uncomment
    }

    public Drive(double percent){
        super();
        addRequirements(Robot.drivetrain);

        drivePercent = percent;
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {}

    // Called every time the scheduler runs (~20ms) while the command is scheduled
    @Override
    public void execute() {
        Robot.drivetrain.driveArcade(drivePercent,0);
    }

    // Return true when the command should end, false if it should continue. Runs every ~20ms.
    @Override
    public boolean isFinished() {
        return false;
    }

    // Called when the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        Robot.drivetrain.driveArcade(0,0);
    }
}
