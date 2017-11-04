package paquete;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CarroBMW c;
		String Modelo;
		c = new CarroBMW();
		Modelo = c.obtenerModelo();
		System.out.println("El modelo de la clase es: " +Modelo);
		c.modeloaConsola();
		c.estado();
		System.out.println("Procedo a encender el carro");
		c.encender();
		c.estado();
		c.turbo();
		
		MINI d;
		d = new MINI();
		d.modeloaConsola();
		d.turbo();
		
	}

}
