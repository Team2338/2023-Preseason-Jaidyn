package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.Robot;
import team.gif.robot.RobotMap;

public class Elevator extends SubsystemBase {

    public final WPI_TalonSRX elevatorMotor;

    public Elevator(){
        elevatorMotor = new WPI_TalonSRX(RobotMap.ELEVATOR_MOTOR_ID);
        elevatorMotor.configFactoryDefault();
        elevatorMotor.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative);
        elevatorMotor.enableVoltageCompensation(true);
        elevatorMotor.setSensorPhase(true);
        elevatorMotor.setInverted(true);
        elevatorMotor.setNeutralMode(NeutralMode.Brake);
    }
    public void move(double percent) {
        elevatorMotor.set(ControlMode.PercentOutput, percent);
    }


}


