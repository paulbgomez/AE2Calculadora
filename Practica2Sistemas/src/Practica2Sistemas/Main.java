
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        
        // Los valores numericos que se usaran para probar las clases
        int firstInt = 6;
        int secondInt = 12;

        // Se invoca la clase Sum y se prueba uno de los metodos
        Sum suma = new Sum();
        System.out.println(suma.sumEnteros(firstInt, secondInt));

        // Se invoca la clase Resta y se prueba uno de los metodos
        Resta resta = new Resta();
        System.out.println(resta.restaEnteros(secondInt, firstInt));

        // Se invoca la clase Division y se prueba uno de los metodos
        Division cociente = new Division();
        System.out.println(cociente.divEnteros(secondInt,firstInt));
        
     // Se invoca la clase Producto y se prueba uno de los metodos
        Producto multiplicacion = new Producto();
        System.out.println(multiplicacion.producEnteros(firstInt, secondInt));
    }
}