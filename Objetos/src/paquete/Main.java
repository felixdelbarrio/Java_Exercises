package paquete;

import paquete.Pelota;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pelota p;
		p = new Pelota();
		
		p.atraparPelota();
		float var = p.obtenerPeso();
		System.out.println("El peso de la pelota es "+var);
		p.patearPelota();
		
		//constructor
		Pelota nw;
		nw =new Pelota(400,400);
		System.out.println("El peso de la nueva pelota es "+nw.obtenerPeso());
		nw.atraparPelota();
	}

}
