package frc.team832.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.RobotBase;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.RunEndCommand;
import frc.team832.lib.driverinput.controllers.Attack3;
import frc.team832.lib.driverinput.controllers.Extreme3DPro;
import frc.team832.lib.driverinput.controllers.StratComInterface;
import frc.team832.lib.driverinput.oi.DriverOI;
import frc.team832.lib.driverinput.oi.SticksDriverOI;
import frc.team832.lib.driverinput.oi.XboxDriverOI;
import frc.team832.lib.power.GrouchPDP;
import frc.team832.lib.util.OscarMath;
import frc.team832.robot.subsystems.*;

public class RobotContainer {

    public final GrouchPDP pdp = new GrouchPDP(0);
    public final Compressor pcm = new Compressor(0);

    public final DriverOI driverOI;
    public static final boolean isSticks = RobotBase.isReal();
    public final StratComInterface stratComInterface = new StratComInterface(isSticks ? 2 : 1);

    public Attack3 leftStick;
    public Extreme3DPro rightStick;

    public final CannonSubsystem cannon = new CannonSubSystem();


    public RobotContainer() {
        if (isSticks) {
            driverOI = new SticksDriverOI();
            leftStick = ((SticksDriverOI)driverOI).leftStick;
            rightStick = ((SticksDriverOI)driverOI).rightStick;
        } else {
            driverOI = new XboxDriverOI();
        }

        configOperatorCommands();
    }

    private void configOperatorCommands() {
        stratComInterface.getSingleToggle().whenHeld(
            // stratComInterface.getArcardeBlackLeft.whenReleased();
        );
    }
}