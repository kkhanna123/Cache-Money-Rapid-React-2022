package frc.robot.command;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class SampleCommand extends Command{
    public void SampleCommand() {
        requires(Robot.subsystem);
    }
    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
        return false;
    }

    public static void randAngle (){
        double rand = Math.random() * 90;
        Robot.subsystem.moveArm(rand);

    }




    
}
