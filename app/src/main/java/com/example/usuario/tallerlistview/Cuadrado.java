package com.example.usuario.tallerlistview;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ResourceCursorAdapter;

public class Cuadrado extends AppCompatActivity {

    private EditText Lado;
    private Resources resource;
    private Intent In;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);

        Lado= (EditText)findViewById(R.id.Resultado);
        resource=this.getResources();
    }

    public void Calcular (View view){
        double res;
        int lado= Integer.parseInt(Lado.getText().toString());
        res= Math.pow(lado,2);

        Resultado obj = new Resultado("Area del cuadrado",res,lado);
        obj.guardar();
        In= new Intent(Cuadrado.this, VistaCalculo.class);
        In.putExtra("TituloOperaciones",resource.getString(R.string.Cuadrado));
        In.putExtra("textResultado","Area: "+obj.getResultado());
        startActivity(In);

    }
    public void borrar(View v){

        Lado.setText("");
        Lado.requestFocus();
    }
}
