package com.example.teva.appli_liste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class descri_sports extends AppCompatActivity {

    private TextView sport_titre=(TextView)findViewById(R.id.sport);
    private TextView sport_descri=(TextView)findViewById(R.id.descri);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descri_sports);

        Intent recup_pos = getIntent();

        int position = recup_pos.getIntExtra("sport",0);

        if (position==0){
            sport_titre.setText(R.string.s1titre);
            sport_descri.setText(R.string.s1text);
        }else if (position==1){
            sport_titre.setText(R.string.s1titre);
            sport_descri.setText(R.string.s1text);
        }else if(position==2){
            sport_titre.setText(R.string.s2titre);
            sport_descri.setText(R.string.s2text);
        }else if(position==3){
            sport_titre.setText(R.string.s3titre);
            sport_descri.setText(R.string.s3text);
        }else if(position==4){
            sport_titre.setText(R.string.s4titre);
            sport_descri.setText(R.string.s4text);

        }
    }
}
