package Practica2Sistemas;

import java.io.IOException;

/**
 * <h2>Clase Resta para poder realizar restas</h2>
 * @author paulbarrosogomez
 * @version 1.0
 */
public class Resta {
	
	/**
	 * Atributo de clase para acumular restas
	 */
	int classNumber = 0;
	
	/**
	 * Metodo para comprobar que el numero introducido no sea menor a 0
	 * @param arg numero a checkear
	 * @throws IOException no se aceptan numeros negativos
	 */
	public void checkArgValue (float arg) throws IOException {
		if (arg < 0) throw new IOException("no se aceptan numeros negativos");    
	}
	
	/**
	 * Metodo para restar dos numeros naturales
	 * @param arg1 primer numero entero de la resta
	 * @param arg2 segundo numero entero de la resta
	 * @throws IOException error cuando los numeros introducidos son negativos
	 * @return numero entero resultado de la resta
	 */
	public float restaReales(float arg1, float arg2) throws IOException {
		checkArgValue(arg1);
		checkArgValue(arg2);
		var result = arg1 - arg2;
		return result;
	}
	
	/**
	 * Sobrecarga de metodo para restar 3 numeros naturales
	 * @param arg1 primer numero entero de la resta
	 * @param arg2 segundo numero entero de la resta
	 * @param arg3 tercer numero entero de la resta
	 * @throws IOException error cuando los numeros introducidos son negativos
	 * @return numero entero resultado de la resta
	 */
	public float restaReales(float arg1, float arg2, float arg3) throws IOException {
		checkArgValue(arg1);
		checkArgValue(arg2);
		checkArgValue(arg3);
		var result = arg1 - arg2 - arg3;
		return result;
	}
	
	/**
	 * Metodo para restar 2 numeros enteros
	 * @param arg1 primer numero entero de la resta
	 * @param arg2 segundo numero entero de la resta
	 * @throws IOException error cuando los numeros introducidos son negativos
	 * @return numero entero resultado de la resta
	 */
	public int restaEnteros(int arg1, int arg2) throws IOException {
		checkArgValue(arg1);
		checkArgValue(arg2);
		var result = arg1 - arg2;
		return result;
	}
	
	/**
	 * Metodo para restar de manera acumulativa sobre un parametro de la clase
	 * @param arg numero entero para la resta
	 * @throws IOException error cuando los numeros introducidos son negativos
	 * @return el valor acumulativo classNumber de la clase
	 */
	public int restaAcumulativa(int arg) throws IOException {
		checkArgValue(arg);
		classNumber = classNumber - arg;
		return classNumber;
	}
}
