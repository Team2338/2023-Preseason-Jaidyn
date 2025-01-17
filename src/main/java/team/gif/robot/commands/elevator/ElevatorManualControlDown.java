package team.gif.robot.commands.elevator;

import edu.wpi.first.wpilibj2.command.CommandBase;
import team.gif.robot.Robot;

public class ElevatorManualControlDown extends CommandBase {
    public ElevatorManualControlDown() {
        super();
        addRequirements(Robot.elevator);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    }

    // Called every time the scheduler runs (~20ms) while the command is scheduled
    @Override
    public void execute() {
        Robot.elevator.setElevatorMotorPercent(-.7);
    }

    // Return true when the command should end, false if it should continue. Runs every ~20ms.
    @Override
    public boolean isFinished() {
        return false;
    }

    // Called when the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        Robot.elevator.setElevatorMotorPercent(0);
    }
}
