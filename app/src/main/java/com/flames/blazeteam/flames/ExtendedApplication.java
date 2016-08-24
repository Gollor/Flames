package com.flames.blazeteam.flames;

import android.app.Application;

/**
 * Created by sergey on 8/24/16.
 */
public class ExtendedApplication extends Application {

    public String text;

    Twitter twitter;
    Instagram instagram;
    Facebook facebook;
    Vk vk;

    public void init()
    {
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
