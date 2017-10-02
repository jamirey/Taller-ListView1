package com.example.usuario.tallerlistview;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Areas extends AppCompatActivity {

    private Resources resources;
    private ListView listView;
    private Intent in;
    String valores [];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areas);
        resources = this.getResources();
        listView = (ListView)findViewById(R.id.ValoresAreas);
        valores = getResources().getStringArray(R.array.ValoresAreas);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,valores);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i){
                    case 0:
                        in = new Intent(Areas.this,Cuadrado.class);
                        startActivity(in);
                        break;
                    case 1:
                        in = new Intent(Areas.this,Rectangulo.class);
                        startActivity(in);
                        break;

                    case 2:
                        in = new Intent(Areas.this,Triangulo.class);
                        startActivity(in);
                        break;

                    case 3:
                        in = new Intent(Areas.this,Circulo.class);
                        startActivity(in);
                        break;
                }
            }
        });

    }


}
