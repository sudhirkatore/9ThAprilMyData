package arrayStudy;

public class Multidimensional_with_new {

	public static void main(String[] args) {
		//1) Multi-Dimensional Array with new keyword 
		
		String name [][]=new String[2][2]; // Array declaration
		
		//Array initialization 
		name[0][0]="Sudhir";
		name[0][1]="Akshay";
		name[1][0]="Krupal";
		name[1][1]="Vivek";
		
		//usage 
		System.out.println("=================================");
		System.out.print(name [0][0]+"  ");
		System.out.println(name [0][1]);
		System.out.print(name [1][0]+"  ");
		System.out.println(name [1][1]);
		System.out.println("---------------------------------");
		
		
		// By using for loop
		for(int i=0;i<=1;i++)//Outer for loop-->for rows(i)
		{
			for(int j=0;j<=1;j++)//Inner for loop -->for column(j)
			{
				System.out.print(name[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("=================================");
		// Array Declaration
		int no[][]=new int[3][3];
		
		// Array initialization
		no[0][0]=10;
		no[0][1]=20;
		no[0][2]=30;
		no[1][0]=40;
		no[1][1]=50;
		no[1][2]=60;
		no[2][0]=70;
		no[2][1]=80;
		no[2][2]=90;
		
		//usage
		
		for(int i=0;i<=2;i++)
		{
			for (int j=0;j<=2;j++)
			{
				System.out.print(no[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("=================================");
		
		
		
		
		
		
		
		

	}

}
