package paquete;
import paquete.Carro;

class CarroBMW extends Carro
{
	public CarroBMW()
	{
		this.modelo = "BMW";
	}
	public void turbo()
	{
		System.out.println("Acabas de viajar a 240 kilometros por hora!!!");
	}
}
