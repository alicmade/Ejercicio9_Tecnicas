package parte2;
import java.util.Scanner;

public class TraduccionES implements Traduccion {
    Scanner tc = new Scanner(System.in);
    double velocidadMedia;

    @Override
    public double introducirDistancia() {
        System.out.println("Introduzca la distancia recorrida (km)");
        double km = tc.nextDouble();
        return km;
    }

    @Override
    public double introducirTiempo() {
        System.out.println("Introduzca el tiempo del recorrido (min)");
        double min = tc.nextDouble();
        double hora = min / 60;
        return hora;
    }

    @Override
    public String inicioRespuesta() {
        System.out.println("Introduzca el idioma (es, en, fr)");

        return tc.next();

    }

    @Override
    public void finRespuesta(Double velocidadMedia) {
        System.out.println(" La velocidad media es: " + velocidadMedia + " km/h");
    }
}




