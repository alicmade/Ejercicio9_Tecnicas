package org.example;

import java.time.LocalDate;

public class Segways extends Alquiler {
    private int autonomia;
    private int alturaMinima = 150;
     private double alturaConductorCm;

     //en el propio constructor se comprueba que la altura del conductor es superior a la altura mínima
    //por defecto la altura mínima es 150cm
    public Segways(String marca, String modelo, LocalDate fechaCompra, int autonomia, double alturaConductor) {
        super(marca, modelo, fechaCompra);
        if (alturaConductorCm >= alturaMinima) {
            this.autonomia = autonomia;
            this.alturaConductorCm = alturaConductor;
            System.out.println("La altura del conductor es superior a la altura mínima, se ha creado correctamente");
        } else {
            System.out.println("La altura del conductor no es superior a la altura mínima, no se ha creado el segway");
        }

    }

    @Override
    public double calcularPrecioAlquiler(double diasAlquiler) {
        double precioDia = 18.90;
        return diasAlquiler * precioDia;
    }
    //metodo para mostrar los datos del segway


    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println(autonomia + "km de autonomía");
    }
}
