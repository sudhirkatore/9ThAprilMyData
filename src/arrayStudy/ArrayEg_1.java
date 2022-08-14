package arrayStudy;

public class ArrayEg_1 {

	public static void main(String[] args) {
		//1. Array Declaration 
		
		
		String name[]=new String [6];    byte roll[]=new byte[6];
		float age[]=new float[6];        int prn[] =new int[6];
		
		
		
		
		//2. Array Initialization
		name[0]="Sudhir K.";             roll[0]=101;
		name[1]="Akshay C.";             roll[1]=102;
		name[2]="Krupal D.";             roll[2]=103;
		name[3]="Vivek";                 roll[3]=104;
		name[4]="Rohit P.";              roll[4]=105;
		name[5]="Samir";                 roll[5]=106;
		
		
		age[0]=22.1f;                    prn[0]=123245;
		age[1]=23.2f;                    prn[1]=654123;
		age[2]=23.0f;                    prn[2]=562341;
		age[3]=23.5f;                    prn[3]=415263;
		age[4]=24.0f;                    prn[4]=236541;
		age[5]=23.7f;                    prn[5]=121256;
		
		
		//3. Usages
		System.out.println("-----Array Study-----");
		System.out.println("======================");
		
		System.out.println("Name = "+name[0]);
		System.out.println("Roll No = "+roll[0]);
		System.out.println("Age = "+age[0]+"Year");
		System.out.println("PRN No = "+prn[0]);
		System.out.println("----------------------");
		
		
		
		System.out.println("Name = "+name[1]);
		System.out.println("Roll No = "+roll[1]);
		System.out.println("Age = "+age[1]+"Year");
		System.out.println("PRN No = "+prn[1]);
		System.out.println("----------------------");
		
		
		System.out.println("Name = "+name[2]);
		System.out.println("Roll No = "+roll[2]);
		System.out.println("Age = "+age[2]+"Year");
		System.out.println("PRN No = "+prn[2]);
		System.out.println("----------------------");
		
		
		System.out.println("Name = "+name[3]);
		System.out.println("Roll No = "+roll[3]);
		System.out.println("Age = "+age[3]+"Year");
		System.out.println("PRN No = "+prn[3]);
		System.out.println("----------------------");
		
		
		System.out.println("Name = "+name[4]);
		System.out.println("Roll No = "+roll[4]);
		System.out.println("Age = "+age[4]+"Year");
		System.out.println("PRN No = "+prn[4]);
		System.out.println("----------------------");
		
		
		System.out.println("Name = "+name[5]);
		System.out.println("Roll No = "+roll[5]);
		System.out.println("Age = "+age[5]+"Year");
		System.out.println("PRN No = "+prn[5]);
		System.out.println("----------------------");

		
		System.out.println("======================");
		
		
		
		
		
		
		//1) Static Coding
		
		System.out.println("------Static Coding-----");
	
		System.out.println("1) Increment--Ascending ");
		for(int i=0;i<=5;i++)
		{
			System.out.println(name[i]);
		}
		System.out.println("----------------------");
		
		
		
		
		System.out.println("2) Decrement--Descending ");
		
		for(int i=5;i>=0;i--)
		{
			System.out.println(name[i]);
		}
		System.out.println("----------------------");
		
		
		
		System.out.println("-----Dynamic Coding----");
		System.out.println("1) Increment--Ascending ");
		for(int i=0;i<=name.length-1;i++)
		{
			System.out.println(name[i]);
		}
		System.out.println("----------------------");
		
		
		
		
		System.out.println("2) Decrement--Descending ");
		
		for(int i=name.length-1;i>=0;i--)
		{
			System.out.println(name[i]);
		}
		System.out.println("----------------------");
		
		
		
		

		

	}

}
