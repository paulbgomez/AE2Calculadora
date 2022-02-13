import java.io.IOException;

/**
 * <h2>Clase Producto para realizar multiplicaciones </h2>
 * @author grupo5
 * @version 1.0
 *
 */

public class Producto {
	
	
		
	/**
	* Metodo para comprobar que el numero introducido no sea menor a 0
	* @param arg numero a comprobar
	* @throws IOException no se aceptan numeros de entrada negativos
	*/
	public void checkArgValue (int arg) throws IOException {
		if (arg < 0) throw new IOException("no se aceptan numeros negativos");    
	}
		
	/**
	* Metodo para multiplicar todos los numeros reales deseados
	* @param arg1 primer parametro de entrada real
	* @param arg2 segundo parametro de entrada real
	* @throws IOException error cuando los numeros introducidos son negativos
	* @return  resultado de la multiplicacion de los numeros introducidos
	* 
	*/
	public float producReales(float arg1, float arg2) throws IOException {
		checkArgValue((int) arg1);
		checkArgValue((int) arg2);
		var result = arg1 * arg2;
		return result;
	}
		
	/**
	* Metodo para multiplicar 2 numeros enteros
	* @param arg1 primer parametro de entrada entero
	* @param arg2 segundo parametro de entrada entero
	* @throws IOException error cuando los numeros introducidos son negativos
	* @return numero entero resultado de la multiplicacion
	*/
	public int producEnteros(float arg1, float arg2) throws IOException {
		checkArgValue((int) arg1);
		checkArgValue((int) arg2);
		var result = arg1 * arg2;
		return  (int) result;
	}
	
	/**
	 * Sobrecarga de metodo para multi`plicar  3 numeros reales
	 * @param arg1 primer numero entero de entrada
	 * @param arg2 segundo numero entero de entrada
	 * @param arg3 tercer numero entero de entrada
	 * @throws IOException error cuando los numeros introducidos son negativos
	 * @return numero entero resultado de la multiplicacion
	 */
	public float producReales(float arg1, float arg2, float arg3) throws IOException {
		checkArgValue((int) arg1);
		checkArgValue((int) arg2);
		checkArgValue((int) arg3);
		var result = arg1 * arg2 * arg3;
		return result;
	}
		
	/**
	* Metodo para calcular la potencia de un numero entero
	* @param arg1 parametro de entrada que sera la base 
	* @param arg2 parametro de entrada para el exponente
	* @throws IOException error cuando los numeros introducidos son negativos. Si el exponente fuese negativo estariamos calculando la potencia del inverso de la base.
	* @return el valor calculado de la potencia. Si los numeros pasados son muy grandes la variable p(int) no tendra suficientes bits para guardar el resultado
	*/
	public double producPotencia(int arg1, int arg2) throws IOException {
		checkArgValue((int) arg1);
		checkArgValue((int) arg2);
		
		double p = Math.pow(arg1,arg2);
		
		return p;
	}

}
