package org.example;

import java.time.LocalDate;

public class Bicicleta extends Alquiler {

    //as bicicletas están equipadas con un sistema de cambio de marchas
//Algunas tienen más velocidades que otras
    private int marchas;

    public Bicicleta(String marca, String modelo, LocalDate fechaCompra, int marchas) {
        super(marca, modelo, fechaCompra);
        this.marchas = marchas;
    }





    //metodo para cambiar la velocidad de la bicicleta
    public void cambiarMarcha(int velocidad) {
        if (velocidad > 0 && velocidad <= marchas) {
            System.out.println("La marcha de la bicicleta es " + velocidad);
        } else {
            System.out.println("La marcha no es válida");
        }
    }


    @Override
    public double calcularPrecioAlquiler(double diasAlquiler) {
        double precioDia = 4.90;
        return diasAlquiler * precioDia;
    }

    //metdodo para mostrar los datos de la bicicleta
    public void mostrar(){
        super.mostrar();
        System.out.println( marchas + " velocidades");
    }

}
