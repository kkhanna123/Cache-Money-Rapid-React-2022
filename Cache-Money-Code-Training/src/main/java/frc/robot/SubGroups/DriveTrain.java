package frc.robot.SubGroups;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
public class DriveTrain {
    //Drive train Id's
  public static final int  MOTOR_LEFT_1_ID = 21;  
  public static final int  MOTOR_LEFT_2_ID = 22;
  public static final int  MOTOR_RIGHT_1_ID = 23;
  public static final int  MOTOR_RIGHT_2_ID = 24;
  public static final int  DRIVERCONTROLLER = 1;
  public static final int  BUTTONCONTROLLER = 1;
  public static final int RIGHT_STICK_Y = 0;
  public static final int RIGHT_STICK_X = 1;
  public static final int BUTTON_LEFTTRIG = 2;
  public static final int BUTTON_RIGHTTRIG = 3;
  public static final int LEFT_STICK_Y = 4;
  public static final int JOYSTICK_Y = 5;
  public static final int BUTTON_GREEN = 1;
  public static final int BUTTON_RED = 2;
  public static final int BUTTON_BLUE = 3;
  public static final int BUTTON_YELLOW = 4;
  public static final int BUTTON_LEFTBUMP = 5;
  public final static int BUTTON_RIGHTBUMP = 6;
  public final static int BUTTON_BACK = 7;
  public final static int BUTTON_START = 8;
  public final static int BUTTON_LEFTSTICK = 9;
  public final static int BUTTON_RIGHTSTICK = 10;
    //Button inputs
    public static Joystick xbox = new Joystick(DRIVERCONTROLLER);
    public static Joystick joystick = new Joystick(BUTTONCONTROLLER);
    public static Button BlueButton = new JoystickButton(xbox,BUTTON_BLUE);
    public static Button RedButton = new JoystickButton(xbox,BUTTON_RED);
    public static Button GreenButton = new JoystickButton(xbox,BUTTON_GREEN);
    public static Button YellowButton = new JoystickButton(xbox,BUTTON_YELLOW);
    public static Button LeftBumpButton = new JoystickButton(xbox,BUTTON_LEFTBUMP);
    public static Button RightBumpButton = new JoystickButton(xbox,BUTTON_RIGHTBUMP);
    public static Button BackButton = new JoystickButton(xbox,BUTTON_BACK);
    public static Button StartButton = new JoystickButton(xbox,BUTTON_START);
    //Motor Variable setup
    private static VictorSPX motorLeft1= new VictorSPX(MOTOR_LEFT_1_ID);
    private static VictorSPX motorLeft2= new VictorSPX(MOTOR_LEFT_1_ID);
    private static VictorSPX motorRight1= new VictorSPX(MOTOR_LEFT_1_ID);
    private static VictorSPX motorRight2= new VictorSPX(MOTOR_LEFT_1_ID);
    


}
