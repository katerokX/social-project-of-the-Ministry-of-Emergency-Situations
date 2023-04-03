package com.example.lab6;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class fair extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fair);
    }
    public void onClickBack(View view){
        onBackPressed();
    }
    public void onClickImage(View view){
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.activity_dialog);
        TextView text = (TextView) dialog.findViewById(R.id.dialogText);
        text.setText("В первую очередь звони в 101. Попытайся потушить сам. Плотно закрой окна и двери. Дыши через мокрую ткань " +
                " ");
        text.setTextSize(25);
        dialog.show();
    }
}
