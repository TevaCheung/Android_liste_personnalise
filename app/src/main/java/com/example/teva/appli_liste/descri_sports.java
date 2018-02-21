package com.example.teva.appli_liste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class descri_sports extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descri_sports);

        Intent recup_pos = getIntent();

        int position = recup_pos.getIntExtra("sport",0);

        if (position==0){

            titre_sport = (TextView)findViewById(R.id.sport);

        }else if (position==1){



        }else if(position==2){


        }else if(position==3){


        }else if(position==4){


        }
    }
}
