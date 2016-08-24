package com.flames.blazeteam.flames;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * TODO
 * This activity has to show the augmented video from camera. Augmentation class still doesn't work,
 * so I suppose that you should get the video, change a few pixels and then show it on screen.
 * This activity also has to create video file adter it's end.
 * Sergey.
 */

public class CameraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    /**
     * TODO
     * This function not only starts the video activity but also saves the shooted video.
     * @param v
     */
    public void startVideoActivity(View v)
    {
        Intent intent = new Intent(this, VideoActivity.class);
        startActivity(intent);
    }
}
