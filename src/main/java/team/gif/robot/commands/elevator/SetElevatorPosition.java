package team.gif.robot.commands.elevator;

import edu.wpi.first.wpilibj2.command.CommandBase;
import team.gif.robot.Constants;
import team.gif.robot.Robot;

public class SetElevatorPosition extends CommandBase {
    public double TargetPos;
    public SetElevatorPosition() {
        super();
        addRequirements(Robot.elevator);
    }

    public SetElevatorPosition(double TarPos) {
        super();
        addRequirements(Robot.elevator);

        TargetPos = TarPos;
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        if (Robot.elevator.getPosition() > Constants.Elevator.MAX_POS) {
            Robot.elevator.setElevatorPos(Constants.Elevator.MAX_POS);
        } else if (Robot.elevator.getPosition() < Constants.Elevator.MIN_POS) {
            Robot.elevator.setElevatorPos(Constants.Elevator.MIN_POS);
        }

        Robot.elevator.setElevatorPos(TargetPos);
    }

    // Called every time the scheduler runs (~20ms) while the command is scheduled
    @Override
    public void execute() {}

    // Return true when the command should end, false if it should continue. Runs every ~20ms.
    @Override
    public boolean isFinished() {
        return false;
    }

    // Called when the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {}
}
