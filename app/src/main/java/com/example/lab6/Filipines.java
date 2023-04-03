package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Filipines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filipines);
    }
    public void onClickBack(View view){
        onBackPressed();
    }
    public void onClickImage(View view){
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.activity_dialog);
        TextView text = (TextView) dialog.findViewById(R.id.dialogText);
        text.setText("бегите вдоль фронта огня; не обгоняйте лесной пожар; для преодоления нехватки кислорода пригнитесь к земле; - дышите через мокрый платок или смоченную одежду" +
                " если невозможно уйти от пожара, войдите в водоем или накройтесь мокрой одеждой, окунитесь в ближайший водоем.");
        text.setTextSize(25);
        dialog.show();
    }
}