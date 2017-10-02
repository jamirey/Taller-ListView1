package com.example.usuario.tallerlistview;

/**
 * Created by SATELLITE on 23/09/2017.
 */

public class Resultado {

    private String Operacion;
    private double resultado;
    private double lado;
    private double lado2;


    public Resultado(String operacion, double resultado, double lado) {
        Operacion = operacion;
        this.resultado = resultado;
        this.lado = lado;
        this.lado2 = lado2;
    }

    public Resultado(String operacion, double resultado, double lado, double lado2) {
        Operacion = operacion;
        this.resultado = resultado;
        this.lado = lado;
        this.lado2 = lado2;
    }

    public double getLado2() {
        return lado2;
    }



    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public String getOperacion() {
        return Operacion;
    }

    public void setOperacion(String operacion) {
        Operacion = operacion;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Resultado{" +
                "Operacion='" + Operacion + '\'' +
                ", resultado=" + resultado +
                ", lado=" + lado +
                ", lado2=" + lado2 +
                '}';
    }

    public void guardar(){
        DatosResultado.guardar(this);
    }
}
