package Practica2Sistemas;


	import java.io.IOException;

	/**
	 * clase Producto para realizar multiplicaciones
	 * @author MiguelPereda
	 * @version 1.0
	 *
	 */

public class Producto {
		
		
			
		/**
		* Metodo para comprobar que el numero introducido no sea menor a 0
		* @param arg1 numero a checkear
		* @throws IOException no se capetan numeros negativos
		*/
		public void checkArgValue (float arg1) throws IOException {
			if (arg1 < 0) throw new IOException("no se aceptan numeros negativos");    
		}
			
		/**
		* Metodo para multiplicar todos los numeros reales deseados
		* @param numbers admite numeros naturales separados por una coma
		* @throws IOException error cuando los numeros introducidos son negativos
		* @return  resultado de la multiplicacion de los numeros introducidos
		* 
		*/
		public float producReales(int arg1, int arg2) throws IOException {
		
				checkArgValue (arg1);
				checkArgValue(arg2);
				var result = 1;
				result = arg1 * arg2; 
			
			return result;
		}
			
		/**
		* Metodo para multiplicar 2 numeros enteros
		* @param arg1 primer numero entero
		* @param arg2 segundo numero entero
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
		 * @param arg1 primer numero entero de la multiplicacion
		 * @param arg2 segundo numero entero de la multiplicacion
		 * @param arg3 tercer numero entero de la multiplicacion
		 * @throws IOException error cuando los numeros introducidos son negativos
		 * @return numero entero resultado de la multiplicacion
		 */
		public float producReales(int arg1, int arg2, int arg3) throws IOException {
			checkArgValue(arg1);
			checkArgValue(arg2);
			checkArgValue(arg3);
			var result = arg1 * arg2 * arg3;
			return result;
		}
			
		/**
		* Metodo que calcula la potencia de un valor
		* @param arg exponente 
		* @param n base de la potencia
		* @param p la potencia
		* @throws IOException error cuando los numeros introducidos son negativos
		* @return el valor calculado de la potencia
		*/
		public int producPotencia(int n, int arg) throws IOException {
			int n1 = 1;
			int p = n1^(arg);
			checkArgValue(arg);
			return p;
		}

	}



