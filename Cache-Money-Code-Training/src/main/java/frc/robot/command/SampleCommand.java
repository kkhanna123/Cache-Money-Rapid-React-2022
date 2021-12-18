package frc.robot.command;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class SampleCommand extends Command{
    public void SampleCommand() {
        requires(Robot.subsystem);
    }

    @Override
    protected void initialize() {
        //Initialize Function
    }

    @Override
    protected void execute() {
        // Executes what's nested in the method every 0.02 seconds
    }

    @Override
    protected void end() {
        // TODO Auto-generated method stub
        super.end();
    }


    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override 
    

    public static void randAngle (){
        double rand = Math.random() * 90;
        Robot.subsystem.moveArm(rand);

    }




    
}
