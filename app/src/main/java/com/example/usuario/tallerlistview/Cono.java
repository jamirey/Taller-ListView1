package com.example.usuario.tallerlistview;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Cono extends AppCompatActivity {
    private EditText RadioCono;
    private EditText AlturaCono;
    private Resources resource;
    private Intent In;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cono);
        RadioCono= (EditText)findViewById(R.id.ValorRadioCono);
        AlturaCono= (EditText)findViewById(R.id.ValorAlturaCono);
        resource=this.getResources();
    }

    public void Calcular (View view){
        double res;
        int radioCono= Integer.parseInt(RadioCono.getText().toString());
        int alturaCono= Integer.parseInt(AlturaCono.getText().toString());
        res = (((3.14)*(Math.pow(radioCono,2))*(alturaCono))/3);
        Resultado obj = new Resultado("Area del Cono",res,radioCono,alturaCono);
        obj.guardar();

        In= new Intent(Cono.this, VistaCalculo.class);
        In.putExtra("TituloOperaciones",resource.getString(R.string.cono));
        In.putExtra("textResultado","Area: "+obj.getResultado());
        startActivity(In);

    }

    public void borrar(View v){

        RadioCono.setText("");
        AlturaCono.setText("");
        RadioCono.requestFocus();
    }
}
