package org.example;

import java.time.LocalDate;

public abstract class Alquiler {
    private String marca;
    private String modelo;
    private LocalDate fechaCompra;

    public Alquiler(String marca, String modelo, LocalDate fechaCompra) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }


    public void mostrar() {
        System.out.print( "Bici" +
                marca  + modelo +
                "(" + fechaCompra  +
                " años)");

    }

    //metodo para calcular el precio del alquiler
    public abstract double calcularPrecioAlquiler(double diasAlquiler);


}
