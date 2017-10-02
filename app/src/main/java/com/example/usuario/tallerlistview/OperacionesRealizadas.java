package com.example.usuario.tallerlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class OperacionesRealizadas extends AppCompatActivity {

    private TableLayout Tabla;
    private ArrayList<Resultado> Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones_realizadas);

        Tabla = (TableLayout)findViewById(R.id.Tabla);
        Resultado=DatosResultado.obtener();

        for (int i = 0; i <Resultado.size() ; i++) {
            String dato2 = Resultado.get(i).getLado2() == 0 ? "N/A": ""+Resultado.get(i).getLado2();
            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);
            TextView c5 = new TextView(this);

            c1.setText(""+(i+1));
            c2.setText(""+Resultado.get(i).getOperacion());
            c3.setText(""+Resultado.get(i).getLado());
            c4.setText(""+dato2);
            c5.setText(""+Resultado.get(i).getResultado());

            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);
            fila.addView(c5);

            Tabla.addView(fila);


        }

    }
}
