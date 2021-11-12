package frc.team832.robot.subsystems;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.SlewRateLimiter;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.controller.ProfiledPIDController;
import edu.wpi.first.wpilibj2.command.*;
import frc.team832.lib.driverstation.dashboard.DashboardManager;
import frc.team832.lib.driverstation.dashboard.DashboardWidget;
import frc.team832.lib.motorcontrol.NeutralMode;
import frc.team832.lib.motorcontrol2.vendor.CANSparkMax;
import frc.team832.lib.motors.Motor;
import frc.team832.lib.power.GrouchPDP;
import frc.team832.lib.power.impl.SmartMCAttachedPDPSlot;
import frc.team832.lib.util.OscarMath;
import frc.team832.robot.Constants;

public class CannonSubsystem extends SubsystemBase {
    public final boolean initSuccessful;

    private final Solenoid fillSolenoid;
    private final Solenoid fireSolenoid;

    private final NetworkTableEntry dashboard_tankPressure, dashboard_firingPressure;

    public CannonSubsytem(GrouchPDP pdp) {
        DashboardManager.addTab(this);

        fillSolenoid = new Solenoid(Constants.PneumaticsValues.PCM_MODULE_NUM, Constants.PneumaticsValues.FILL_SOLENOID_ID);
        fireSolenoid = new Solenoid(Constants.PneumaticsValues.PCM_MODULE_NUM, Constants.PneumaticsValues.FIRE_SOLENOID_ID);

        // dashboard_tankPressure = DashboardManager.addTabItem(this, "Tank Pressure", false, DashboardWidget.BooleanBox);
        // dashboard_firingPressure = DashboardManager.addTabItem(this, "Firing Pressure", );

        initSuccessful = true;
    }

    public void periodic() {
    }
    
    
    // public void lockClimb() {
    //     stopClimb();
    //     climbLock.set(false);
    // }
    // public void unlockClimb() { climbLock.set(true); }

    // Commands:
    // private class StartClimbGroup extends SequentialCommandGroup {
    //     public StartClimbGroup(boolean climbUp) {
    //         addRequirements(ClimbSubsystem.this);
    //         addCommands(
    //                 new InstantCommand(ClimbSubsystem.this::unlockClimb, ClimbSubsystem.this),
    //                 new WaitCommand(0.2),
    //                 new InstantCommand(climbUp ? ClimbSubsystem.this::windWinch : ClimbSubsystem.this::unwindWinch, ClimbSubsystem.this)
    //         );
    //     }
    // }

    // private class StopClimbGroup extends SequentialCommandGroup {
    //     public StopClimbGroup(){
    //         addRequirements(ClimbSubsystem.this);
    //         addCommands(
    //                 new InstantCommand(ClimbSubsystem.this::stopClimb),
    //                 new WaitCommand(0.2),
    //                 new InstantCommand(ClimbSubsystem.this::lockClimb)
    //         );
    //     }
    // }
}
