package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.Constants;
import team.gif.robot.Robot;
import team.gif.robot.RobotMap;

public class Elevator extends SubsystemBase {
    public final WPI_TalonSRX elevatorMotor = new WPI_TalonSRX(RobotMap.ELEVATOR_MOTOR_ID);

    public Elevator(){
        elevatorMotor.configFactoryDefault();
        elevatorMotor.setNeutralMode(NeutralMode.Brake);

        //encoders
        elevatorMotor.setSensorPhase(true);
        elevatorMotor.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative);

        elevatorMotor.setInverted(true);
    }

    /**
     * This method is used to set the elevator power/percent.
     * @param percent is the targeted percentage
     */
    public void setElevatorMotorPercent(double percent) {
        elevatorMotor.set(ControlMode.PercentOutput, percent);
    }

    /**
     *  This method is used to se the position of the elevator.
     *  @param pos is the targeted position
     */
    public void setElevatorPos(double pos) {
        elevatorMotor.set(ControlMode.Position, pos);
    }

    /**
     * This method will used to see the position of the
     * elevator using the encoder.
     * @return encoders position
     */
    public double getPosition() {
        return elevatorMotor.getSelectedSensorPosition();
    }

    /**
     * This method will set the elevator encoder to 0
     * everytime we tell it to do.
     */
    public void zeroEncoder() {
        elevatorMotor.setSelectedSensorPosition(0);
    }
}


