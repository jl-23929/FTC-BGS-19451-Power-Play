package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class MeepMeepTesting {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(800);

        RoadRunnerBotEntity myBot = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(16, 60, Math.toRadians(180), Math.toRadians(180), 8.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-35, -61, Math.toRadians(90)))
                                .forward(13)
                                .addDisplacementMarker(() -> {


                                })
                                .waitSeconds(2)
                                .forward(13)
                                .forward(23.5/2)
                                .strafeLeft(3)
                                .addDisplacementMarker(() -> {


                                })
                                .waitSeconds(3)
                                .strafeRight(3)
                                .forward(23.5/2)
                                .strafeLeft(23.5)
                                .addDisplacementMarker(() -> {


                                  })
                                .waitSeconds(3)
                                .strafeRight(23.5)
                                .back(23.5/2)
                                .strafeLeft(3)
                                .addDisplacementMarker(() -> {


                                })
                                .waitSeconds(2)
                                .strafeRight(3)
                                .build()

                );

        meepMeep.setBackground(MeepMeep.Background.FIELD_POWERPLAY_OFFICIAL)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(myBot)
                .start();
    }
}