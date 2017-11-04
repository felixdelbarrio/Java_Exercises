package break_y_continue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++)
		{
			System.out.println("Aun estas en el ciclo");
			if (i==4)
			{
				// continue;
				break; //salirse de un ciclo
			}
			
			System.out.println("El valor de i es: " +i);
		}
		System.out.println("has dejado el ciclo for");
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("Aun estas en el ciclo");
			if (i==4)
			{
			    continue; //en el ciclo se salta el 4
				
			}
			
			System.out.println("El valor de i es: " +i); //Al estar en el for, el continue no lo muestra
		}
		System.out.println("has dejado el ciclo for");
	}
	

}
