package com.example.usuario.tallerlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class VistaCalculo extends AppCompatActivity {

    private TextView TituloOperaciones;
    private TextView textResultado;

       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_calculo);

           TituloOperaciones= (TextView) findViewById(R.id.TituloOperacion);
           textResultado= (TextView) findViewById(R.id.textResultado);
           TituloOperaciones.setText(getIntent().getExtras().getString("TituloOperaciones"));
           textResultado.setText(getIntent().getExtras().getString("textResultado"));


    }

    public void Regresar(View view){
        finish();
    }
}
