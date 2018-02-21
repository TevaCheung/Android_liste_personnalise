package com.example.teva.appli_liste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView liste_cible;
    public static String EXTRA_CHOIX="sport";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        liste_cible=(ListView)findViewById(R.id.liste_sports);

        final String[] donnees_tab = new String[] {"football","cricket","aquaponey", "tennis"};

        ArrayAdapter<String> mon_adapteur = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                donnees_tab
        );

        liste_cible.setAdapter(mon_adapteur);

        liste_cible.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent_sport = new Intent (MainActivity.this, descri_sports.class);

                intent_sport.putExtra(EXTRA_CHOIX,position);
                startActivity(intent_sport);
            }
        });

    /*
        holder = new ViewHolder();
        holder.title = (TextView) v.findViewById(R.id.title);
        holder.desc = (TextView) v.findViewById(R.id.description);
        v.setTag(holder);

     */

}




