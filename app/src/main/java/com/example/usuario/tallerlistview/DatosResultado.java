package com.example.usuario.tallerlistview;

import java.util.ArrayList;

/**
 * Created by SATELLITE on 23/09/2017.
 */

public class DatosResultado {

    private static ArrayList<Resultado> Resultado= new ArrayList<>();

    public static void guardar(Resultado R){ Resultado.add(R);
    }

    public static ArrayList<Resultado> obtener(){
        return Resultado ;
    }


}
