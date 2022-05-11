package frc.team832.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.team832.robot.Constants;

public class CannonSubsystem extends SubsystemBase {
    private final Solenoid fillSolenoid = new Solenoid(Constants.PneumaticsValues.PCM_MODULE_NUM, Constants.PneumaticsValues.FILL_SOLENOID_ID);
    private final Solenoid fireSolenoid = new Solenoid(Constants.PneumaticsValues.PCM_MODULE_NUM, Constants.PneumaticsValues.FIRE_SOLENOID_ID);

    private final AnalogInput storagePressureSensor = new AnalogInput(0);
    private final AnalogInput firingPressureSensor = new AnalogInput(2);

    public CannonSubsystem() {
        
    }

    public void periodic() {
        updateDashboardData();
    }

    private void updateDashboardData() {
        SmartDashboard.putNumber("Storage Pressure", storagePressureSensor.getAverageVoltage());
        SmartDashboard.putNumber("Firing Pressure", firingPressureSensor.getAverageVoltage());
    }

    public void closeFiringValve() {
        fireSolenoid.set(false);
    }

    public void openFiringValve() {
        fireSolenoid.set(true);
    }

    public void closeFillValve() {
        fillSolenoid.set(false);
    }

    public void openFillValve() {
        fillSolenoid.set(true);
    }
}
