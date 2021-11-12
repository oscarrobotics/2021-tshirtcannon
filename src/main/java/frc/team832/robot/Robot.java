/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team832.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.team832.lib.CANDevice;
import frc.team832.robot.commands.DumbAutoCommand;
import frc.team832.robot.subsystems.CannonSubsystem;

public class Robot extends TimedRobot {

  public final RobotContainer robotContainer = new RobotContainer();

  private final Compressor pcm = robotContainer.pcm;
  private final CannonSubsystem cannon = robotContainer.cannon;

  private final Command autoCommand = new DumbAutoCommand();

  @Override
  public void robotInit() {
    if (cannon.initSuccessful) {
      // addPeriodic(cannon::updateControlLoops, Constants.CannonValues.ControlLoopPeriod);
      System.out.println("Cannon - init OK");
    } else {
      System.out.println("Cannon - init FAILED");
    }

    CANDevice.printMissingDevices();
  }

  @Override
  public void robotPeriodic() {
    CommandScheduler.getInstance().run();
  }

  @Override
  public void autonomousInit() {
    autoCommand.schedule();
  }

  @Override
  public void autonomousPeriodic() { }

  @Override
  public void teleopInit() {
    autoCommand.cancel();
  }

  @Override
  public void teleopPeriodic() { }

  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() { }
}
