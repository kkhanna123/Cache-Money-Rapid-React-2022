package frc.robot.SubGroups;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Lift extends Subsystem{
    public static VictorSPX climbMotor = new VictorSPX(0);
    //???
    public static VictorSPX climbMotorRetract = new VictorSPX(0);
    @Override
    protected void initDefaultCommand() {
        // TODO Auto-generated method stub

    }

    public static void extendClimbOverDeltaT(double deltaT){
        climbMotor.set(ControlMode.PercentOutput, demand);
        
        boolean buttonActivated = true;
        //if ( button activated ) 
        while (buttonActivated){
            // int armDistance = 50;
            // double speed = armDistance / deltaT
        }
    }

    public static void retractClimbOverDeltaT(double deltaT){
        /*
        while(something.getButtonDown?(something)==true){
            climbMotorRetract.somethingLikeSetAngle();
            
        }
        
        */

    }



    
    
}
