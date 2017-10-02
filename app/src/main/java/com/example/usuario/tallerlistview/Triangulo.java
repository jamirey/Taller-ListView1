package com.example.usuario.tallerlistview;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Triangulo extends AppCompatActivity {

    private EditText ValorBase;
    private EditText ValorAltura;
    private Resources resource;
    private Intent In;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);

        ValorBase= (EditText)findViewById(R.id.ValorBase);
        ValorAltura= (EditText)findViewById(R.id.ValorAltura);
        resource=this.getResources();
    }

    public void Calcular (View view){

        double res;

        int valorbase= Integer.parseInt(ValorBase.getText().toString());
        int valoraltura= Integer.parseInt(ValorAltura.getText().toString());

        res= (0.5)*(valorbase*valoraltura);

        Resultado obj = new Resultado("Area del Triangulo",res,valorbase,valoraltura);
        obj.guardar();

        In= new Intent(Triangulo.this, VistaCalculo.class);
        In.putExtra("TituloOperaciones",resource.getString(R.string.Triangulo));
        In.putExtra("textResultado","Area: "+obj.getResultado());
        startActivity(In);

    }

    public void borrar(View v){

        ValorBase.setText("");
        ValorAltura.setText("");
        ValorBase.requestFocus();
    }
}
