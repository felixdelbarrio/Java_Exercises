package ciclos2;

public class Main {

	public static void main(String[] args) {
		// Algoritmos ciclicos

		System.out.println("Serie de numeros impares");
		for (int i=0;i<=100;i++)
		{
			if ((i%2)!=0)
			{
				System.out.println(i);
			}
			
		}
		
		System.out.println("Serie fibonacci 1,1,2,3,5,8,11...");
		int x=1;
		int anterior = 0;
		int temp;
		while(true)
		{
			System.out.println(x);
			temp = x;
			x = x + anterior;
			anterior = temp;
			if (x>30)
			{break;}
		}

		

	}

}
