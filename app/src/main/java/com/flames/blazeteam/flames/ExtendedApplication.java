package com.flames.blazeteam.flames;

import android.app.Application;

/**
 * This is the main class for application.
 * It extends the Application class and can be accessed from any point from program.
 * It should contain global settings and some other things, like interfaces for social networks.
 * Since most work in application is cross-activity, some functions should also be implemented
 * in this scope.
 */
public class ExtendedApplication extends Application {

    //There should be declared program parameters.
    public String text;

    public int particleIntensity;
    public int particleDuration;
    public int particleSize;

    Twitter twitter;
    Instagram instagram;
    Facebook facebook;
    Vk vk;

    public void init() {
        text = "Global settings are initialized.";
        twitter = new Twitter();
        instagram = new Instagram();
        facebook = new Facebook();
        vk = new Vk();
    }

    String getText() {
        return text;
    }
}
