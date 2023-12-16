package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.Robot;
import team.gif.robot.RobotMap;

public class Collector extends SubsystemBase {
    public static WPI_TalonSRX collectorMotor = new WPI_TalonSRX(RobotMap.COLLECTOR);

    public Collector() {
        collectorMotor.configFactoryDefault();

        collectorMotor.setNeutralMode(NeutralMode.Brake);
    }

    public void setCollectorMotor(double percent) {
        collectorMotor.set(percent);
    }
}
