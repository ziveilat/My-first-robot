package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
    private SpeedController left;
    private SpeedController right;

    public Drivetrain(SpeedController left, SpeedController right) {
        this.left = left;
        this.right = right;
        right.setInverted(true);
    }

    public void MoveTank(double speedRight, double speedLeft) {
        left.set(speedLeft);
        right.set(speedRight);

    }

    public void stop() {
        left.stopMotor();
        right.stopMotor();
    }

}
