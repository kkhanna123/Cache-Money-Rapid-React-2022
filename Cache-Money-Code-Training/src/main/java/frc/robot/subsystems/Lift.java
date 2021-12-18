package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Lift extends Subsystem{
    public static VictorSPX climbMotorExtend = new VictorSPX(0);
    public static VictorSPX climbMotorRetract = new VictorSPX(1);
    //public static JoystickButton
    @Override
    protected void initDefaultCommand() {
        // TODO Auto-generated method stub

    }

    public static void extend(double deltaT){
        climbMotorExtend.set(ControlMode.PercentOutput, demand);
        
        boolean buttonActivated = true;
        
        // int armDistance = 50;
        // double speed = armDistance / deltaT;
        while (buttonActivated){
            climbMotorExtend.set(ControlMode.PercentOutput, 1.0);
        }
    }
    public static void retract(double amount){
        climbMotorRetract.set(ControlMode.PercentOutput, amount*-1);//*-1 if the motor should go the opp direction?
    }   


    
    
}
/*
set modes
The output mode to apply. 
In PercentOutput, the output is between -1.0 and 1.0, with 0.0 as stopped. 
In Velocity mode, output value is in position change / 100ms. 
In Position mode, output value is in encoder ticks or an analog value, depending on the sensor. 
In Follower mode, the output value is the integer device ID of the motor controller to duplicate.
*/
//documentation: http://www.ctr-electronics.com/downloads/api/java/html/classcom_1_1ctre_1_1phoenix_1_1motorcontrol_1_1can_1_1_victor_s_p_x.html