package Practica2Sistemas;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        
        // Los valores numericos que se usaran para probar las clases
        int firstInt = 6;
        int secondInt = 12;

        // Se invoca la clase Sum y se prueba uno de los metodos
        Sum suma = new Sum();
        System.out.println(suma.sumReales(firstInt, secondInt));

        // Se invoca la clase Resta y se prueba uno de los metodos
        Resta resta = new Resta();
        System.out.println(resta.restaReales(secondInt, firstInt));
    }
}
