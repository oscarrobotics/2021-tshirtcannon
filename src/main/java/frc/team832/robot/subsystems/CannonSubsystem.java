package frc.team832.robot.subsystems;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.team832.lib.driverstation.dashboard.DashboardManager;
import frc.team832.lib.driverstation.dashboard.DashboardWidget;
import frc.team832.lib.power.GrouchPDP;
import frc.team832.robot.Constants;

public class CannonSubsystem extends SubsystemBase {
    public final boolean initSuccessful;

    private final Solenoid fillSolenoid;
    private final Solenoid fireSolenoid;

    private final NetworkTableEntry dashboard_tankPressure, dashboard_firingPressure;

    public CannonSubsystem(GrouchPDP pdp) {
        DashboardManager.addTab(this);

        fillSolenoid = new Solenoid(Constants.PneumaticsValues.PCM_MODULE_NUM, Constants.PneumaticsValues.FILL_SOLENOID_ID);
        fireSolenoid = new Solenoid(Constants.PneumaticsValues.PCM_MODULE_NUM, Constants.PneumaticsValues.FIRE_SOLENOID_ID);

        dashboard_tankPressure = DashboardManager.addTabItem(this, "Tank Pressure", false, DashboardWidget.BooleanBox);
        dashboard_firingPressure = DashboardManager.addTabItem(this, "Firing Pressure",0, DashboardWidget.NumberBar);

        initSuccessful = true;
    }

    public void periodic() {
    }
}
