package frc.robot.SubGroups;



public class SampleCommand extends Subsystem {
    public static Servo armMotor = new Servo(0);
    @Override
    protected void initDefaultCommand() {
        // TODO Auto-generated method stub

    }

    public void moveMotor(double degrees){
        armMotor.setAngle(degrees);
    }



    
}
