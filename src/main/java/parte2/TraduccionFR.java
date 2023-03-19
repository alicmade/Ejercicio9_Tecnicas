package parte2;

import java.util.Scanner;

public class TraduccionFR implements Traduccion {
    static Scanner tc = new Scanner(System.in);

    @Override
    public double introducirDistancia() {
        System.out.println("Entrez la distance parcourue (km)");
        double km = tc.nextDouble();
        return km;
    }

    @Override
    public double introducirTiempo() {
        System.out.println("Entrez le temps de trajet (min)");
        double min = tc.nextDouble();
        double hora = min / 60;
        return hora;
    }


    @Override
    public String inicioRespuesta(){
        System.out.println("Entrez la langue (es, en, fr)");
        return tc.next();
    };

    @Override
    public void finRespuesta(Double velocidadMedia) {
        System.out.println(" La vitesse moyenne est de: " + velocidadMedia + " km/h");
    }
}

