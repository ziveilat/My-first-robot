package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

import java.util.function.Supplier;

public class MoveDrivetrain extends CommandBase {
    private Supplier<Double> speedLeft;
    private Supplier<Double> speedRight;

    private Drivetrain drivetrain;
    public MoveDrivetrain(Drivetrain drivetrain, Supplier<Double> speedleft, Supplier<Double> speedright)
    {
        this.drivetrain = drivetrain;
        this.speedLeft = speedleft;
        this.speedRight = speedright;

    }

    @Override
    public void execute() {
        drivetrain.
    }

    @Override
    public void end(boolean interrupted) {

    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
