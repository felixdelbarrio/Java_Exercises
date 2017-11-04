
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[][];
		x= new int[2][3];
		x[0][0] =1;
		x[0][1] =2;
		x[0][2] =3;
		x[1][0] =4;
		x[1][1] =5;
		x[1][2] =6;
		

		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("x["+i+"]["+j+"]: " +x[i][j]);
			}
		}
		
	}

}
