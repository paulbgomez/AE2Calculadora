package Practica2Sistemas;
import java.io.IOException;

/**
 * <h2>Clase Sum para poder realizar sumas</h2>
 * @author paulbarrosogomez
 * @version 1.0
 */
public class Sum {

	/*
	 * Atributo de clase para sumas acumulativas
	 */
		int classNumber = 0;
		
	/**
	* Metodo para comprobar que el numero introducido no sea menor a 0
	* @param arg numero a checkear
	* @throws IOException no se capetan numeros negativos
	*/
	public void checkArgValue (int arg) throws IOException {
		if (arg < 0) throw new IOException("no se aceptan numeros negativos");    
	}
		
	/**
	* Metodo para sumar todos los numeros naturales deseados
	* @param numbers admite numeros naturales separados por una coma
	* @throws IOException error cuando los numeros introducidos son negativos
	* @return int resultado de la suma de los numeros introducidos
	* 
	*/
	public int sumReales(Integer... numbers) throws IOException {
		var result = 0;
		for(int num : numbers) { 
			checkArgValue(num);
			result = result + num; 
		}
		return result;
	}
		
	/**
	* Metodo para sumar 2 numeros enteros
	* @param arg1 primer numero entero
	* @param arg2 segundo numero entero
	* @throws IOException error cuando los numeros introducidos son negativos
	* @return numero entero resultado de la suma
	*/
	public float sumEnteros(float arg1, float arg2) throws IOException {
		checkArgValue((int) arg1);
		checkArgValue((int) arg2);
		var result = arg1 + arg2;
		return result;
	}
		
	/**
	* Metodo que suma de manera acumulativa con un parametro de clase 
	* @param arg numero entero para la suma
	* @throws IOException error cuando los numeros introducidos son negativos
	* @return el valor acumulativo classNumber de la clase
	*/
	public int sumAcumulativo(int arg) throws IOException {
		checkArgValue(arg);
		classNumber = classNumber + arg;
		return classNumber;
	}

}
