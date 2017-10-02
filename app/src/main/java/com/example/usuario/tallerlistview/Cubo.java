package com.example.usuario.tallerlistview;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Cubo extends AppCompatActivity {

    private EditText Arista;
    private Resources resource;
    private Intent In;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);
        Arista = (EditText)findViewById(R.id.TxtCubo);
        resource=this.getResources();
    }

    public void Calcular (View view){

        double res;
        int arista= Integer.parseInt(Arista.getText().toString());
        res= Math.pow(arista,3);

        Resultado obj = new Resultado("Volumen del cubo",res,arista);
        obj.guardar();
        In= new Intent(Cubo.this, VistaCalculo.class);
        In.putExtra("TituloOperaciones",resource.getString(R.string.Cubo));
        In.putExtra("textResultado",resource.getString(R.string.Volumen)+" "+obj.getResultado());
        startActivity(In);

    }
    public void borrar(View v){

        Arista.setText("");
        Arista.requestFocus();
    }
}
