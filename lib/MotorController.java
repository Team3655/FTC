package org.firstinspires.ftc.lib;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import java.util.Map;
import java.util.*;


public class MotorController {
    
    private static ArrayList<MotorController> instances=new ArrayList<>();
    
    //the motor to control
    DcMotor m;
    
    /**Contruct a motor controller from a previously identified motor
     * 
     * 
     * 
     **/
    public MotorController(DcMotor motor){
        //set class variable m to the motor passed upon instantiation
        m=motor;
        instances.add(this);
    }
    
    public void setPos(int pos,int power){
        m.setTargetPosition(pos);
        m.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        m.setPower(power);
        
        
        
    }
    
    /**Sets the motor to go at a specific power during duty cycle
     * 
     **/
    public void set(double power){
        m.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        m.setPower(power);
    }
    
    public void setDirection(DcMotor.Direction direction){
        m.setDirection(direction);
    }
    
    public DcMotor getMotor(){
        return m;
    }
    
    public int pos(){
        return m.getCurrentPosition();
    }
    
    public int targetPos(){
        return m.getTargetPosition();
    }
    
}
