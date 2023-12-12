package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.Robot;
import team.gif.robot.RobotMap;

public class Drivetrain extends SubsystemBase {
    public static TalonSRX leftMotor = new WPI_TalonSRX(RobotMap.LEFT_MOTOR);
    public static TalonSRX rightMotor = new WPI_TalonSRX(RobotMap.RIGHT_MOTOR);
    private static DifferentialDrive drive;

    public Drivetrain() {
        leftMotor.configFactoryDefault();
        rightMotor.configFactoryDefault();

        leftMotor.setNeutralMode(NeutralMode.Brake);
        rightMotor.setNeutralMode(NeutralMode.Brake);

        drive = new DifferentialDrive((MotorController) leftMotor, (MotorController) rightMotor);

        // turn off the drive train watchdog - otherwise it outputs unnecessary errors on the console
        drive.setSafetyEnabled(true);

        Robot.pigeon.resetPigeonPosition();
    }

    public void driveArcade(double spd, double rot) {
        drive.arcadeDrive(spd, rot);
    }

    public void driveTank(double leftSpeed, double rightSpeed) {
        drive.tankDrive(leftSpeed,rightSpeed);
    }
}
