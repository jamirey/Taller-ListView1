package com.example.usuario.tallerlistview;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Esfera extends AppCompatActivity {

    private EditText Radio;
    private Resources resource;
    private Intent In;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfera);

        Radio= (EditText)findViewById(R.id.Resultado);
        resource=this.getResources();
    }

    public void Calcular (View view){

        double res;

        int radio= Integer.parseInt(Radio.getText().toString());

        res= (4*Math.PI*Math.pow(radio,3))/3;

        Resultado obj = new Resultado("Area del Esfera",res,radio);
        obj.guardar();

        In= new Intent(Esfera.this, VistaCalculo.class);
        In.putExtra("TituloOperaciones",resource.getString(R.string.esfera));
        In.putExtra("textResultado","Area: "+obj.getResultado());
        startActivity(In);

    }
    public void borrar(View v){

        Radio.setText("");
        Radio.requestFocus();
    }
}
