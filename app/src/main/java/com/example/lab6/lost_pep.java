package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class lost_pep extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lost_pep);
    }
    public void onClickBack(View view){
        onBackPressed();
    }

    public void onClickImage(View view){
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.activity_dialog);
        TextView text = (TextView) dialog.findViewById(R.id.dialogText);
        text.setText("Определить одно направление, по которому будешь двигаться. Прислушивайтесь – недалеко может проходить железная либо автодорога.Если на пути встретилась река, идите вниз по течению. " +
                "Так человек не попадет в болото и сможет выйти к населенному пункту.Обнаружив охотничий или рыбацкий домик, лучше оставаться там. Их поисковые группы обследуют в первую очередь.");
        text.setTextSize(25);
        dialog.show();
    }
}

