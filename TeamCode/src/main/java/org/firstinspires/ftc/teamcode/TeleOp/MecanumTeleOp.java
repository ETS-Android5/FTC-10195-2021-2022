package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Robot.Robot;

@TeleOp(name = "Mecanum TeleOp", group = "1")
public class MecanumTeleOp extends LinearOpMode {

    private Robot wildWing = new Robot();

    @Override
    public void runOpMode() throws InterruptedException {
        initRobot(wildWing);
        waitForStart();
        while (opModeIsActive() && !isStopRequested()) {
            mainLoop(wildWing);
        }
    }

    public void initRobot(Robot robot) {
        robot.init(hardwareMap, Robot.Alliance.BLUE);
    }

    public void mainLoop(Robot robot) {
        robot.drive(
                gamepad1.left_stick_x,
                gamepad1.left_stick_y,
                gamepad1.right_stick_x,
                gamepad1.left_trigger,
                gamepad1.right_bumper,
                gamepad1.left_bumper,
                gamepad1.a,
                gamepad1.b,
                gamepad1.dpad_up || gamepad2.dpad_up,
                gamepad1.dpad_down || gamepad2.dpad_down
        );
    }
}