package org.example;

import java.time.LocalDate;

public class Giroscopios extends Alquiler{
    private int autonomia;

    public Giroscopios(String marca, String modelo, LocalDate fechaCompra, int autonomia) {
        super(marca, modelo, fechaCompra);
        this.autonomia = autonomia;
    }


    @Override
    public double calcularPrecioAlquiler(double diasAlquiler) {
        double precioDia = 29.90;
        return diasAlquiler * precioDia;
    }

    //metodo para mostrar los datos del giroscopio


    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println(autonomia + "km de autonomía");
    }
}
