package com.example.usuario.tallerlistview;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Cilindro extends AppCompatActivity {

     private EditText RadioCilindro;
     private EditText AlturaCilindro;
     private Resources resource;
     private Intent In;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cilindro);

        RadioCilindro= (EditText)findViewById(R.id.ValorRadio);
        AlturaCilindro= (EditText)findViewById(R.id.ValorAltura);
        resource=this.getResources();
    }

    public void Calcular (View view){

        double res;

        int radioCilindro= Integer.parseInt(RadioCilindro.getText().toString());
        int alturaCilindro= Integer.parseInt(AlturaCilindro.getText().toString());

        res = ((3.14) * (Math.pow(radioCilindro,2)) * alturaCilindro);

        Resultado obj = new Resultado("Area del Cilindro",res,radioCilindro,alturaCilindro);
        obj.guardar();

        In= new Intent(Cilindro.this, VistaCalculo.class);
        In.putExtra("TituloOperaciones",resource.getString(R.string.cilindro));
        In.putExtra("textResultado","Area: "+obj.getResultado());
        startActivity(In);

    }
    public void borrar(View v){
        RadioCilindro.setText("");
        AlturaCilindro.setText("");

    }

}
