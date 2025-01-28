package org.firstinspires.ftc.teamcode.Teleop;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;
import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.command.CommandScheduler;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.arcrobotics.ftclib.trajectory.TrapezoidProfile;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.I2cDevice;


import org.firstinspires.ftc.teamcode.globals;
import org.firstinspires.ftc.teamcode.robotHardware;

import org.firstinspires.ftc.teamcode.subsystems.driveBase;

import org.tensorflow.*;



@TeleOp(name = "mainOpMode", group = "Linear OpMode")
public class mainOpMode extends CommandOpMode {


    private FtcDashboard dashboard = FtcDashboard.getInstance();
    private driveBase drive = new driveBase();
    private robotHardware robot = robotHardware.getInstance();
    private GamepadEx driverOp;
    private GamepadEx controlOp;
    //private Thread armThread= new Thread(arm);
    private Vector2d input;
    private boolean sniper = false;
    private boolean forceRun = false;

    



    @Override
    public void initialize() {
        CommandScheduler.getInstance().reset();
        

        if(!globals.autoRan){
            robot.init(hardwareMap);
        }



        driverOp = new GamepadEx(gamepad1);
        controlOp = new GamepadEx(gamepad2);



        while(!opModeIsActive() && globals.hardwareInit){
            //armStart.start();
            telemetry.addData("status","ready");
            telemetry.update();
        }

    }


    @Override
    public void run() {

            input = new Vector2d(
                    -gamepad1.left_stick_y,
                    -gamepad1.left_stick_x
            );


// Pass in the rotated input + right stick value for rotation
// Rotation is not part of the rotated input thus must be passed in separately

        }



}
