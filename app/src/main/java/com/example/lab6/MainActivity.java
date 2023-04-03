package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClickKurili(View view)
    {
        Intent intent = new Intent(this, Kurili.class);
        startActivity(intent);
    }
    public void onClickKanari(View view)
    {
        Intent intent = new Intent(this, kanari.class);
        startActivity(intent);
    }
    public void onClickFilipines(View view)
    {
        Intent intent = new Intent(this, Filipines.class);
        startActivity(intent);
    }
    public void onClickMaldives(View view)
    {
        Intent intent = new Intent(this, Maldives.class);
        startActivity(intent);
    }
    public void onClickdtp(View view) {
        Intent intent = new Intent(this, dtp.class);
        startActivity(intent);
    }
    public void onClicklost_pep(View view) {
        Intent intent = new Intent(this, lost_pep.class);
        startActivity(intent);
    }
    public void onClickfair(View view) {
        Intent intent = new Intent(this, fair.class);
        startActivity(intent);
    }
    public void toVideo(View view){
        Intent intent = new Intent(this, video.class);
        startActivity(intent);
    }
    public void toTravma(View view){
        Intent intent = new Intent(this, travma.class);
        startActivity(intent);
    }

    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {

        return false;
    }

}