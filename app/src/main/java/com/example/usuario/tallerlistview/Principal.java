package com.example.usuario.tallerlistview;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    private ListView lv;
    private Resources resources;
    private ListView listView;
    private Intent in;

    String valores [];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        lv = (ListView)findViewById(R.id.Opciones);
        resources = this.getResources();
        listView = (ListView) findViewById(R.id.Opciones);
        valores = getResources().getStringArray(R.array.Valores);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,valores);
        listView.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i){
                    case 0:
                        in = new Intent(Principal.this,Areas.class);
                        startActivity(in);
                        break;
                    case 1:
                        in = new Intent(Principal.this,Volumenes.class);
                        startActivity(in);
                        break;

                    case 2:
                        in = new Intent(Principal.this,OperacionesRealizadas.class);
                        startActivity(in);
                        break;
                }
            }
        });
    }
}
