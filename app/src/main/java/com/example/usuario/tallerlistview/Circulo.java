package com.example.usuario.tallerlistview;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Circulo extends AppCompatActivity {

    private EditText Radio;
    private Resources resource;
    private Intent In;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);

        Radio= (EditText)findViewById(R.id.Resultado);
        resource=this.getResources();
    }

    public void Calcular (View view){

        double res;
        double pi= 3.14;

        int radio= Integer.parseInt(Radio.getText().toString());
        res = (pi)*(Math.pow(radio,2));

        Resultado obj = new Resultado("Area del Circulo",res,radio);
        obj.guardar();
        In= new Intent(Circulo.this, VistaCalculo.class);
        In.putExtra("TituloOperaciones",resource.getString(R.string.Circulo));
        In.putExtra("textResultado","Area: "+obj.getResultado());
        startActivity(In);

    }
    public void borrar(View v){

        Radio.setText("");

    }
}
