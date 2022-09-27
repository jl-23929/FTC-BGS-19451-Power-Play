/* Copyright (c) 2017 FIRST. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted (subject to the limitations in the disclaimer below) provided that
 * the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list
 * of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice, this
 * list of conditions and the following disclaimer in the documentation and/or
 * other materials provided with the distribution.
 *
 * Neither the name of FIRST nor the names of its contributors may be used to endorse or
 * promote products derived from this software without specific prior written permission.
 *
 * NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
 * LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.util.ElapsedTime;
/*
@Autonomous(name="AutonomousDriveOnly", group="Linear OpMode")
public class autonomousDriveOnly extends LinearOpMode {
    // Declare OpMode members.
    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor frontLeftDrive = null;
    private DcMotor frontRightDrive = null;
    private DcMotor backLeftDrive = null;
    private DcMotor backRightDrive = null;
    double speed = 1.0;
    double gearReduction = 72;
    double countsPerRev = 288;
    double wheelCircumferenceMM = 251.28;
    double driveCountsMM = (countsPerRev * gearReduction / wheelCircumferenceMM);
    double driveCounts = driveCountsMM * 10;
    int frontRightTarget;
    int frontLeftTarget;
    int backRightTarget;
    int backLeftTarget;
    int colourDetected = 1;
    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        // Initialises the motors and sensors (hardware variables).
        // The strings correlate to the names of the motors in the configuration settings on the robot.
        // If the names correllate, but do not correlate to the correct

        frontLeftDrive = hardwareMap.get(DcMotor.class, "frontLeftDrive");
        frontRightDrive = hardwareMap.get(DcMotor.class, "frontRightDrive");
        backLeftDrive = hardwareMap.get(DcMotor.class, "backLeftDrive");
        backRightDrive = hardwareMap.get(DcMotor.class, "backRightDrive");

        frontRightDrive.setDirection(DcMotor.Direction.REVERSE);
        backRightDrive.setDirection(DcMotor.Direction.REVERSE);
        waitForStart();
        runtime.reset();

switch(colourDetected) {

    case 1:

        frontRightTarget = frontRightDrive.getCurrentPosition() + (int) (-60 * driveCounts);
        frontLeftTarget = frontLeftDrive.getCurrentPosition() + (int) (60 * driveCounts);
        backRightTarget = backRightDrive.getCurrentPosition() + (int) (-60 * driveCounts);
        backLeftTarget = backLeftDrive.getCurrentPosition() + (int) (60 * driveCounts);

        frontRightDrive.setTargetPosition(frontRightTarget);
        frontLeftDrive.setTargetPosition(frontLeftTarget);
        backRightDrive.setTargetPosition(backRightTarget);
        backLeftDrive.setTargetPosition(backLeftTarget);

        frontRightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        frontRightDrive.setPower(speed);
        frontLeftDrive.setPower(speed);
        backRightDrive.setPower(speed);
        backLeftDrive.setPower(speed);

        while (opModeIsActive() && (frontRightDrive.isBusy() || frontLeftDrive.isBusy() || backLeftDrive.isBusy() || backRightDrive.isBusy())) {
        }

        break;

    case 2:

        frontRightTarget = frontRightDrive.getCurrentPosition() + (int) (60 * driveCounts);
        frontLeftTarget = frontLeftDrive.getCurrentPosition() + (int) (60 * driveCounts);
        backRightTarget = backRightDrive.getCurrentPosition() + (int) (60 * driveCounts);
        backLeftTarget = backLeftDrive.getCurrentPosition() + (int) (60 * driveCounts);

        frontRightDrive.setTargetPosition(frontRightTarget);
        frontLeftDrive.setTargetPosition(frontLeftTarget);
        backRightDrive.setTargetPosition(backRightTarget);
        backLeftDrive.setTargetPosition(backLeftTarget);

        frontRightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        frontRightDrive.setPower(speed);
        frontLeftDrive.setPower(speed);
        backRightDrive.setPower(speed);
        backLeftDrive.setPower(speed);

        while (opModeIsActive() && (frontRightDrive.isBusy() || frontLeftDrive.isBusy() || backLeftDrive.isBusy() || backRightDrive.isBusy())) {
        }

        break;

    case 3:

        frontRightTarget = frontRightDrive.getCurrentPosition() + (int) (60 * driveCounts);
        frontLeftTarget = frontLeftDrive.getCurrentPosition() + (int) (-60 * driveCounts);
        backRightTarget = backRightDrive.getCurrentPosition() + (int) (60 * driveCounts);
        backLeftTarget = backLeftDrive.getCurrentPosition() + (int) (-60 * driveCounts);

        frontRightDrive.setTargetPosition(frontRightTarget);
        frontLeftDrive.setTargetPosition(frontLeftTarget);
        backRightDrive.setTargetPosition(backRightTarget);
        backLeftDrive.setTargetPosition(backLeftTarget);

        frontRightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRightDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeftDrive.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        frontRightDrive.setPower(speed);
        frontLeftDrive.setPower(speed);
        backRightDrive.setPower(speed);
        backLeftDrive.setPower(speed);

        while (opModeIsActive() && (frontRightDrive.isBusy() || frontLeftDrive.isBusy() || backLeftDrive.isBusy() || backRightDrive.isBusy())) {
        }

        break;
}




        telemetry.addData("Status", "Run Time: " + runtime.toString()); //Displays elapsed time on phone.
        telemetry.update();

    }
}
*/