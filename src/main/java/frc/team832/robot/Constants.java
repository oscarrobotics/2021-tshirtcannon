package frc.team832.robot;

import edu.wpi.first.wpilibj.controller.SimpleMotorFeedforward;
import edu.wpi.first.wpilibj.geometry.Pose2d;
import edu.wpi.first.wpilibj.geometry.Rotation2d;
import edu.wpi.first.wpilibj.kinematics.DifferentialDriveKinematics;
import edu.wpi.first.wpilibj.system.LinearSystem;
import edu.wpi.first.wpilibj.system.plant.DCMotor;
import edu.wpi.first.wpilibj.system.plant.LinearSystemId;
import edu.wpi.first.wpilibj.trajectory.TrajectoryConfig;
import edu.wpi.first.wpilibj.trajectory.TrapezoidProfile;
import edu.wpi.first.wpilibj.trajectory.constraint.DifferentialDriveVoltageConstraint;
import edu.wpi.first.wpilibj.util.Units;
import edu.wpi.first.wpiutil.math.MathUtil;
import edu.wpi.first.wpiutil.math.numbers.N1;
import edu.wpi.first.wpiutil.math.numbers.N2;

import javax.sound.midi.Track;

@SuppressWarnings("unused")
public class Constants {

    @SuppressWarnings("unused")
    public static class Cannon {
        public static double ControlLoopPeriod = 0.01;
        }

    @SuppressWarnings("unused")
    public static class PneumaticsValues {
        public static final int PCM_MODULE_NUM = 0;

        public static final int FILL_SOLENOID_ID = 0;
        public static final int FIRE_SOLENOID_ID = 3;
    }

    public static class LEDValues {
        public static final int LED_PWM_PORT = 9;
    }
}

