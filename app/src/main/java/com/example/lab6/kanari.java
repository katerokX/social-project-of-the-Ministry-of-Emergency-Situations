package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class kanari extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanari);
    }
    public void onClickBack(View view){
        onBackPressed();
    }
    public void onClickImage(View view){
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.activity_dialog);
        TextView text = (TextView) dialog.findViewById(R.id.dialogText);
        text.setText("Не делайте резких движений и не обламывайте кромку. Если достаете ногами до противоположного края провала," +
                " примите горизонтальное положение, упираясь в него ногами, вытащите на лед сначала одну ногу, затем вторую..");
        text.setTextSize(25);
        dialog.show();
    }
}