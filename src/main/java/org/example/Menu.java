package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    private static HashMap<Object, Alquiler> bicicletasAAlquilar = new HashMap<Object, Alquiler>();
    public  void alquilar() {
        Scanner sc = new Scanner(System.in);
        tarifasbici();
        System.out.println("Que tipo de bici desea alquilar?");
        System.out.println("1. Bici");
        System.out.println("2. Giroscopio");
        System.out.println("3. Seagways");
        System.out.println("4. No quiero alquilar nada");
        int opcion = 0;
        do {
            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado bicicleta");
                    System.out.println("¿Qué marca de bicicleta que desea alquilar?");
                    String marca = sc.nextLine();
                    System.out.println("¿Modelo que desea alquilar la bicicleta?");
                    String modelo = sc.next();
                    System.out.println("¿Qué día recojerá la bici?");
                    int dia = sc.nextInt();
                    System.out.println("¿Qué mes recojerá la bici?");
                    int mes = sc.nextInt();
                    System.out.println("¿Qué año recojerá la bici?");
                    int año = sc.nextInt();
                    LocalDate fechaDeCompra = LocalDate.of(año, mes, dia);
                    System.out.println("¿Cuántas marchas tiene la bicicleta?");
                    int marchas = sc.nextInt();
                    Bicicleta bici = new Bicicleta(marca, modelo, fechaDeCompra, marchas);
                    bicicletasAAlquilar.put(bici, bici);
                    break;
                case 2:
                    System.out.println("Ha seleccionado giroscopio");
                    System.out.println("¿Qué marca de bicicleta que desea alquilar?");
                    String marcaGiroscopio = sc.nextLine();
                    System.out.println("¿Modelo que desea alquilar la bicicleta?");
                    String modeloGiroscopio = sc.next();
                    System.out.println("¿Qué día recojerá la bici?");
                    int diaGiroscopio = sc.nextInt();
                    System.out.println("¿Qué mes recojerá la bici?");
                    int mesGiroscopio = sc.nextInt();
                    System.out.println("¿Qué año recojerá la bici?");
                    int añoGiroscopio = sc.nextInt();
                    System.out.println("¿Cuántos km de autonomía tiene el giroscopio?");
                    int autonomiaGiroscopio = sc.nextInt();

                    LocalDate fechaDeCompraGiroscopio = LocalDate.of(diaGiroscopio, mesGiroscopio, añoGiroscopio);
                    Giroscopios giroscopio = new Giroscopios(marcaGiroscopio, modeloGiroscopio, fechaDeCompraGiroscopio, autonomiaGiroscopio);
                    break;
                case 3:
                    System.out.println("Ha seleccionado segways");
                    System.out.println("¿Qué marca de segways que desea alquilar?");
                    String marcaSeagways = sc.nextLine();
                    System.out.println("¿Modelo que desea alquilar la segways?");
                    String modeloSeagways = sc.next();
                    System.out.println("¿Qué día recojerá la segways?");
                    int diaSeagways = sc.nextInt();
                    System.out.println("¿Qué mes recojerá la segways?");
                    int mesSeagways = sc.nextInt();
                    System.out.println("¿Qué año recojerá la segways?");
                    int añoSeagways = sc.nextInt();
                    System.out.println("¿Cuántos km de autonomía tiene el segways?");
                    int autonomiaSeagways = sc.nextInt();
                    System.out.println("¿Qué altura tine en cm? (Se necesita una altura minima)");
                    int alturaSeagways = sc.nextInt();
                    LocalDate fechaDeCompraSeagways = LocalDate.of(diaSeagways, mesSeagways, añoSeagways);
                    Segways seagways = new Segways(marcaSeagways, modeloSeagways, fechaDeCompraSeagways, autonomiaSeagways, alturaSeagways);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 4);

        mostrarTodoAlquiler();
    }

    //metodo para mostrar el hashmap
    public static void mostrarTodoAlquiler(){
        for (Alquiler alquiler : bicicletasAAlquilar.values()) {
            alquiler.mostrar();
        }
    }

    public static void tarifasbici(){
        //mostranos las tafifas de alquiler
        System.out.println("Estos son los ciclos que ofrecemos en alquiler:\n" +
                "\n");
        System.out.print("- Bicis Lapierre speed 400 (1 año) 27 velocidades                  4,90€/hora " + "\n" +
                "- Bicis Btwin riverside 900 (0 años) 10 velocidades                4,90€/hora" + "\n" +
                "- Giroscpio Segway Nine (0 años) 40 km de autonomía [1h50 min]     9,90€/hora" + "\n" +
                "- Giroscopio Weebot Echo (1 año) 35 km de autonomía [1h60 min]     9,90€/hora" + "\n" +
                " - Segways Immotion v8 (0 años) 40 km de autonomía                 18,90€/hora" + "\n" +
                "- Segways Segway Ninebot One E+ (0 años) 30 km de autonomía       18,90€/hora" + "\n" );

    }


}
