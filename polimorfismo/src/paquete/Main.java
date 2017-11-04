package paquete;
import paquete.Carro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro generico;
		generico = new Carro();
		System.out.println(generico.informacion());
		
		//el polimorfismo lo implementamos llamando a otra clase que
		//aun heredando la clase Carro implementa de nuevo el metodo
		//informacion solo que hace algo distinto que en la clase principal
		
		BMW coche_nuevo;
		coche_nuevo = new BMW();
		System.out.println(coche_nuevo.informacion());
				

	}

}
