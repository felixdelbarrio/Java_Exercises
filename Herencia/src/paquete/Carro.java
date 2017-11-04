package paquete;

public class Carro {
	
	//Variables
	double peso;
	double altura;
	double ancho;
	double largo;
	int puertas;
	boolean encendido;
	String modelo;
	
	//Constructores
	public Carro()
	{
		this.peso =100;
		this.altura = 0.80;
		this.ancho = 1000;
		this.largo = 3000;
		this.puertas = 5;
		this.modelo = "Scenic";
				
	}
	public Carro(double peso, double altura, double ancho, double largo, int puertas, String modelo)
	{
		this.peso =peso;
		this.altura = altura;
		this.ancho = ancho;
		this.largo = largo;
		this.puertas = puertas;
		this.modelo = modelo;
	}
	//Metodos
	public String obtenerModelo()
	{
		return this.modelo;
	}
	public void modeloaConsola()
	{
		System.out.println("El modelo es "+this.modelo);
	}
	public void encender()
	{
		this.encendido = true;

	}
	public void apagar()
	{
		this.encendido = false;

	}
	public void estado()
	{
		if(this.encendido)
		{
			System.out.println("El carro está encendido");
		}
		else
		{
			System.out.println("El carro está apagado");
		}
	}

}


