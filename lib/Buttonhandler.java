package org.firstinspires.ftc.lib;

import com.qualcomm.robotcore.hardware.Gamepad;

public class Buttonhandler {
    private static Buttonhandler instance;
    private Gamepad gamepad1;
    private Gamepad gamepad2;
    
    public Buttonhandler(Gamepad gamepad1,Gampad gamepad2){
        g=gamepad;
        
    }
    
    protected void buttonPressed(ButtonEvent e){
        
    }
    
    public static void update(){
        if (!(instance=null)){
            if (gamepad1.a){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_A,ButtonEvent.Ctrl.c1));
            }
            if (gamepad1.b){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_B,ButtonEvent.Ctrl.c1));
            }
            if (gamepad1.back){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_back,ButtonEvent.Ctrl.c1));
            }
            if (gamepad1.dpad_down){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_down,ButtonEvent.Ctrl.c1));
            }
            if (gamepad1.dpad_left){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_left,ButtonEvent.Ctrl.c1));
            }
            if (gamepad1.dpad_right){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_right,ButtonEvent.Ctrl.c1));
            }
            if (gamepad1.dpad_up){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_up,ButtonEvent.Ctrl.c1));
            }
            if (gamepad1.guide){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_guide,ButtonEvent.Ctrl.c1));
            }
            if (gamepad1.left_bumper){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_LB,ButtonEvent.Ctrl.c1));
            }
            if (gamepad1.left_stick_button){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_LJS,ButtonEvent.Ctrl.c1));
            }
            if (gamepad1.left_trigger){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_LT,ButtonEvent.Ctrl.c1));
            }
            if (gamepad1.right_bumper){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_RB,ButtonEvent.Ctrl.c1));
            }
            if (gamepad1.right_stick_button){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_RJS,ButtonEvent.Ctrl.c1));
            }
            if (gamepad1.right_trigger){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_RT,ButtonEvent.Ctrl.c1));
            }
            if (gamepad1.start){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_start,ButtonEvent.Ctrl.c1));
            }
            if (gamepad1.x){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_Y,ButtonEvent.Ctrl.c1));
            }
            if (gamepad1.y){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_X,ButtonEvent.Ctrl.c1));
            }
            if (gamepad1.a){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_A,ButtonEvent.Ctrl.c2));
            }
            if (gamepad1.b){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_B,ButtonEvent.Ctrl.c2));
            }
            if (gamepad1.back){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_back,ButtonEvent.Ctrl.c2));
            }
            if (gamepad1.dpad_down){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_down,ButtonEvent.Ctrl.c2));
            }
            if (gamepad1.dpad_left){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_left,ButtonEvent.Ctrl.c2));
            }
            if (gamepad1.dpad_right){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_right,ButtonEvent.Ctrl.c2));
            }
            if (gamepad1.dpad_up){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_up,ButtonEvent.Ctrl.c2));
            }
            if (gamepad1.guide){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_guide,ButtonEvent.Ctrl.c2));
            }
            if (gamepad1.left_bumper){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_LB,ButtonEvent.Ctrl.c2));
            }
            if (gamepad1.left_stick_button){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_LJS,ButtonEvent.Ctrl.c2));
            }
            if (gamepad1.left_trigger){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_LT,ButtonEvent.Ctrl.c2));
            }
            if (gamepad1.right_bumper){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_RB,ButtonEvent.Ctrl.c2));
            }
            if (gamepad1.right_stick_button){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_RJS,ButtonEvent.Ctrl.c2));
            }
            if (gamepad1.right_trigger){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_RT,ButtonEvent.Ctrl.c2));
            }
            if (gamepad1.start){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_start,ButtonEvent.Ctrl.c2));
            }
            if (gamepad1.x){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_Y,ButtonEvent.Ctrl.c2));
            }
            if (gamepad1.y){
                buttonPressed(new ButtonEvent(ButtonEvent.ButtonCode.VB_X,ButtonEvent.Ctrl.c2));
            }
        }
    }
    
    protected class ButtonEvent {

        public static enum ButtonCode {VB_A,VB_B,VB_back,VB_down,VB_left,VB_right,VB_up,VB_guide,VB_LB,VB_RB,VB_LT,VB_RT,VB_start,VB_X,VB_Y,VB};
        public static enum Ctrl {c1,c2}
        private ButtonCode code;
        private Ctrl ctrl;
        
        ButtonEvent(ButtonCode c,Crtl crtl){
            code=c;
            this.ctrl=ctrl;
        }
        
        /**
         * 
         * @return the button code of the button event
         **/
        public ButtonCode getCode(){
            return code;
        }
        
        /**
         * 
         * @return the id of the controller of the button event
         **/ 
        public Crtl getCtrl(){
            return ctrl;
        }
        
    }
    
}