package Practica2Sistemas;
import java.io.IOException;


/**
 * <h2>Clase Division para realizar cocientes </h2>
 * @author grupo5
 * @version 1.0
 */
public class Division {

	/**
	* Metodo para comprobar que el numero introducido no sea menor que cero
	* @param arg numero a comprobar
	* @throws IOException no existe solucion real
	*/
	public void checkArgValue (int arg) throws IOException {
		if (arg <0) throw new IOException("No existe solucion real");    
	}
	
	/**
	* Metodo para comprobar que el numero introducido no sea cero
	* @param arg numero a comprobar
	* @throws IOException no se puede dividir entre cero
	*/
	public void checkArgValue0 (double arg) throws IOException {
		if (arg == 0) throw new IOException("No se puede dividir entre 0");    
	}
			
	/**
	* Metodo para dividir 2 numeros reales, siendo el divisor distinto de cero
	* @param arg1 primer parametro de entrada 
	* @param arg2 segundo parametro de entrada
	* @throws IOException error cuando el divisor es cero
	* @return numero real resultado del cociente. Devuelve un float porque el cociente de dos números reales puede no ser un entero
	*/
	public float divReales(float arg1, float arg2) throws IOException {
		checkArgValue0((int) arg2);
		float result = arg1/arg2;
		return result;
	}
		
	/**
	* Metodo para dividir 2 numeros enteros, siendo el divisor distinto de cero
	* @param arg1 primer parametro de entrada 
	* @param arg2 segundo parametro de entrada
	* @throws IOException error cuando el divisor es cero 
	* @return numero real resultado del cociente, devuelve un float porque el cociente de dos numeros enteros puede no ser un entero
	*/
	public float divEnteros(int arg1, int arg2) throws IOException {
		checkArgValue0(arg2);
		float result = arg1/arg2;
		return result;
	}

	/**
	* Metodo para calcular el inverso de un numero real
	* @param arg parametro de entrada numero real
	* @throws IOException error cuando numero introducido es cero
	* @return numero real resultado de realizar el inverso del parametro de entrada 
	*/
	public double inverso(double arg) throws IOException {
		checkArgValue0( arg);
		double result = 1/arg;
		return result;
	}

	/**
	* Metodo para calcular la raiz cuadrada de un numero entero
	* @param arg numero entero
	* @throws IOException error cuando el numero introducido es menor que cero
	* @return numero real resultado de hacer la raiz cuadrada. Devuelve un float porque la raiz de un numero entero puede no ser un entero
	*/
	public double raizCuadrada(int arg) throws IOException {
		checkArgValue(arg);
		double result = Math.sqrt(arg);
		return result;
	}
	
	

}