package frc.team832.robot.commands;

import edu.wpi.first.wpilibj2.command.*;

public class DumbAutoCommand extends SequentialCommandGroup {

    public DumbAutoCommand() {
        addCommands(
                //new AutoShootCommandGroup(superStructure).withTimeout(3.5),
                // new InstantCommand(() -> drivetrain.setWheelVolts(-.5, .5),drivetrain),
                // new WaitCommand(0.75),
                // new InstantCommand(() -> drivetrain.setWheelVolts(0.0, 0.0), drivetrain)
        );
    }
}
