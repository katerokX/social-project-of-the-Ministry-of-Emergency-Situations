package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;

public class Kurili extends AppCompatActivity {
    Button clk;
    VideoView videov;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurili);



    }
    public void onClickBack(View view){
        onBackPressed();
    }

    public void onClickImage(View view){
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.activity_dialog);
        TextView text = (TextView) dialog.findViewById(R.id.dialogText);
        text.setText("Почувствовав в помещении запах газа, немедленно перекройте его подачу к плите. Предупредите соседей и от них по телефону вызовите аварийную газовую службу, избегая всяких " +
                " действий, вызывающих искрение и повышение воздуха в квартире. При этом не курите, не зажигайте спичек, не включайте свет и электроприборы..");
        text.setTextSize(25);
        dialog.show();
    }




}