package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem{
    public static Servo armMotor = new Servo(0);
    @Override
    protected void initDefaultCommand() {
    }
    protected void goToDefault(){
        armMotor.setPosition(0.0);
    }
    protected void armUp(){
        double pos = armMotor.getPosition();
        armMotor.setPosition(pos += 0.1);
    }
    protected void armDown(){
        double pos = armMotor.getPosition();
        armMotor.setPosition(pos -= 0.1);
    }
    
    
}
