package com.example.usuario.tallerlistview;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Rectangulo extends AppCompatActivity {


    private EditText Lado1;
    private EditText Lado2;
    private Resources resource;
    private Intent In;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);

        Lado1= (EditText)findViewById(R.id.ValorBase);
        Lado2= (EditText)findViewById(R.id.ValorAltura);
        resource=this.getResources();

    }

    public void Calcular (View view){

        double res;
        int ValorLado1= Integer.parseInt(Lado1.getText().toString());
        int ValorLado2= Integer.parseInt(Lado2.getText().toString());
        res= ValorLado1*ValorLado2;

        Resultado obj = new Resultado("Area del Rectangulo",res,ValorLado1,ValorLado2);
        obj.guardar();
        In= new Intent(Rectangulo.this, VistaCalculo.class);
        In.putExtra("TituloOperaciones",resource.getString(R.string.Triangulo));
        In.putExtra("textResultado","Area: "+obj.getResultado());
        startActivity(In);

    }
    public void borrar(View v){

        Lado1.setText("");
        Lado2.setText("");
        Lado1.requestFocus();
    }
}
