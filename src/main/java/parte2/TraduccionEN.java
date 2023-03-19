package parte2;

import java.util.Scanner;
public class TraduccionEN implements Traduccion {
    Scanner tc = new Scanner(System.in);


    @Override
    public double introducirDistancia() {
        System.out.println("Enter the distance traveled (km)");
        double km = tc.nextDouble();
        return km;
    }

    @Override
    public double introducirTiempo() {
        System.out.println("Enter the travel time (min)");
        double min = tc.nextDouble();
        double hora = min / 60;
        return hora;
    }

    @Override
    public String inicioRespuesta() {
        System.out.println("Enter the language (es, en, fr)");

        return tc.next();
    }

    @Override
    public void finRespuesta(Double velocidadMedia) {

        System.out.println(" The average speed is: " + velocidadMedia + " km/h");
    }
}

