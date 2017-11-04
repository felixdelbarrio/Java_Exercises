/**
 * 
 */
/**
 * @author felixdelbarriocebrian
 *
 */
package paquete;

import java.io.*;

class Main {
	/**
	 * @param args
	 * leer desde el teclado
	 * concat()
	 * toUpperCase()
	 * toLowerCase()
	 * leght()
	 * Convertir variables numericas a String y viceversa
	 */
	public static void main(String[] args)	{
		String texto = "";
		int longitud = 0;
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(in);
		System.out.println("escribe debajo de esta linea algo");
		/**leer desde el teclado*/
		try {
			texto = buffer.readLine();
		}catch(IOException e){};
		
		/**a lo que se haya incluido en la consola se le conctena un texto*/
		texto = texto.concat(" : Esto es una concatenación");
		System.out.println(texto);
		texto = texto.toUpperCase();
		/**volcamos el tecto a mayusculas*/
		System.out.println(texto);
		/**volcamos el texto a minusculas*/
		texto=texto.toLowerCase();
		System.out.println(texto);
		/**Cambiamos el contenido de la variable longitud a texto*/
		System.out.println(longitud);
		/**obtenemos la longitud del texto en variable*/
		longitud = texto.length();
		java.lang.System.out.println(longitud);
		System.out.println("la frase tiene "+longitud+ " caracteres");
		
		/**Hacer operaciones a traves de los introducido en la consola*/
		System.out.println("escribe un numero debajo de esta linea algo");
		try{
			texto = buffer.readLine();
			longitud = Integer.parseInt(texto);
		}catch(Exception e){
			System.out.println("Debes escribir un número, tomare la longitud de la frase para añadir 2");
		};
		/**le sumamos dos unidades al numero introducido por consola*/
		System.out.println(longitud+2);
		/**Hacer operaciones desde la consola con un double*/
		double longitud2 = 0 ;
		System.out.println("escribe un numero,con decimales, debajo de esta linea algo");
		try{
			texto =buffer.readLine();
			longitud2 = Double.parseDouble(texto);
		}catch(Exception e){
			System.out.println("Debes escribir un número, tomare la longitud de la frase para añadir 2");
		};
		/**le sumamos dos unidades al numero introducido por consola*/
		System.out.println(longitud2+2);
		
	
		String s_double_a_texto ="";
		/**convertir a texto el ultimo valor almacenado*/
		s_double_a_texto = String.valueOf(longitud2);
		s_double_a_texto = s_double_a_texto.concat(" > No es un double sino texto");
		java.lang.System.out.println(s_double_a_texto);
	 
	}
}