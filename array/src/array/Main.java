package array;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[];
		x =new int[3];
		int y[] = new int[3];
		int z[] = {10,5,7};
		
		x[0] = 10;
		x[1] = 5;
		x[2] = 7;
		
		//x[3] = 2; //Daría error al superar el limite del array
		
		for(int i=0;i<x.length;i++)
		{
			System.out.println("Array en el indice x:"+1+" es igual a:" + x[i]);
			if (i==y.length-1)
			{System.out.println("Array en el indice z:"+1+" es igual a:" + z[i]);}
			
		}
	}

}
