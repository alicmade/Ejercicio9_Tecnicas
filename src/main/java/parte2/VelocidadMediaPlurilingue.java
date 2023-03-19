package parte2;

import java.util.Scanner;

public class VelocidadMediaPlurilingue {
    static Traduccion traduccion = new TraduccionES();
    static String idiomaSeleccionado = "null";

    public static void main(String[] args) {
        String idioma = traduccion.inicioRespuesta();
        ;
        switch (idioma) {
            case "es":
                traduccion = new TraduccionES();
                idiomaSeleccionado = "es";
                double km = traduccion.introducirDistancia();
                double hora = traduccion.introducirTiempo();
                double velocidadMedia = km / hora;
                traduccion.finRespuesta(velocidadMedia);
                break;
            case "en":
                traduccion = new TraduccionEN();
                idiomaSeleccionado = "en";
                double kmEN  = traduccion.introducirDistancia();
                double horaEN = traduccion.introducirTiempo();
                double velocidadMediaEN = kmEN / horaEN;
                traduccion.finRespuesta(velocidadMediaEN);
                break;
            case "fr":
                traduccion = new TraduccionFR();
                idiomaSeleccionado = "fr";
                double kmFR = traduccion.introducirDistancia();
                double horaFR = traduccion.introducirTiempo();
                double velocidadMediaFR = kmFR / horaFR;
                traduccion.finRespuesta(velocidadMediaFR);
                break;
            default:
                System.out.println("Idioma no soportado");
        }

    }

}