package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class dtp extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dtp);
    }
    public void onClickBack(View view){
        onBackPressed();
    }

    public void onClickImage(View view){
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.activity_dialog);
        TextView text = (TextView) dialog.findViewById(R.id.dialogText);
        text.setText("Если увидели в автобусе - сразу сообщите водителю, если в подъезде жилого дома - спросите у сосдей, если владелец не установлен - сообщить в милицию(102)" +
                "в каком-либо учреждении - немедленно сообщите о находке администрации или охране учреждения");
        text.setTextSize(25);
        dialog.show();
    }

}
