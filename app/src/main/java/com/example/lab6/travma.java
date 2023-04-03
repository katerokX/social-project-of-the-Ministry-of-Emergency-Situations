package com.example.lab6;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class travma extends AppCompatActivity {
    VideoView videoPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.travma);

        videoPlayer = (VideoView) findViewById(R.id.videoPlayer);
        Uri myVIdeoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.nature2);
        videoPlayer.setVideoURI(myVIdeoUri);
    }
    public void play(View view){
        videoPlayer.start();
    }
    public void pause(View view){
        videoPlayer.pause();
    }
    public void stop(View view){
        videoPlayer.stopPlayback();
        videoPlayer.resume();
    }
    public void onClickBack(View view){
        onBackPressed();
    }
}
