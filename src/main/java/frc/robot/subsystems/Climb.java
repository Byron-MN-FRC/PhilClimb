// RobotBuilder Version: 4.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

// ROBOTBUILDER TYPE: Subsystem.

package frc.robot.subsystems;


// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Climb extends SubsystemBase {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
private AnalogPotentiometer elbowPtRight;
private AnalogPotentiometer shoulderPtRight;
private WPI_TalonFX rightBicep;
private WPI_TalonSRX rightForearm;
private AnalogPotentiometer elbowPtLeft;
private AnalogPotentiometer shoulderPtLeft;
private WPI_TalonFX leftBicep;
private WPI_TalonSRX leftForearm;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
private double BarX;
private double BarY;
private double BisepActuater;
private double ElbowAngle;
private double ShoulderAngle;
private double ForearmActuater;

    /**
    *
    */
    public Climb() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
elbowPtRight = new AnalogPotentiometer(0, 1.0, 0.0);
 addChild("elbowPtRight", elbowPtRight);
 

shoulderPtRight = new AnalogPotentiometer(1, 1.0, 0.0);
 addChild("shoulderPtRight", shoulderPtRight);
 

rightBicep = new WPI_TalonFX(4);
 
 

rightForearm = new WPI_TalonSRX(6);
 
 

elbowPtLeft = new AnalogPotentiometer(2, 1.0, 0.0);
 addChild("elbowPtLeft", elbowPtLeft);
 

shoulderPtLeft = new AnalogPotentiometer(3, 1.0, 0.0);
 addChild("shoulderPtLeft", shoulderPtLeft);
 

leftBicep = new WPI_TalonFX(5);
 
 

leftForearm = new WPI_TalonSRX(7);
 
 


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
        SmartDashboard.putNumber("AAA", elbowPtLeft.get());

    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run when in simulation

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void leftArmMath() {
        ElbowAngle = elbowPtLeft.get();
        ShoulderAngle = shoulderPtLeft.get();
        ForearmActuater = Math.pow((BarX*BarX)+(BarY*BarY),.5);
        BisepActuater = (Constants.halfSpoolDistance*Constants.halfSpoolDistance)+(Constants.bicepToBase*Constants.bicepToBase);

        }

}

