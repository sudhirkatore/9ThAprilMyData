package Assignment;

public class Loop_Study_Assignment {

	public static void main(String[] args) {
		//1. for loop study.
		
	
		System.out.println("----for loop----Incremental----");
        for(int a=19; a<=190; a=a+19)
		{
			System.out.println(a);
		}
		
		
		System.out.println("===================================");
		System.out.println("----for loop----Decremental----");
		for(int a=190;a>=9;a=a-19)
		{
			System.out.println(a);
		}
		
		//2. while loop study
		
		System.out.println("===================================");
		System.out.println("----While loop----Incremental----");
		int a=18;
		while (a<=180)
		{
			System.out.println(a);
			a=a+18;
			
		}
		
		System.out.println("===================================");
		System.out.println("----While loop----Decremental----");
		int b=180;
		while (b>=18)
		{
			System.out.println(b);
			b=b-18;}
			
		//3.Do while loop
			{
			System.out.println("===================================");
			System.out.println("----Do while loop----Incremental----");
			int c=17;
			do {
				System.out.println(c);
				c=c+17;
			} 
			while (c<=170);}
			
			{
			System.out.println("===================================");
			System.out.println("----Do while loop----Decremental----");
			int d=170;
			do
			{
				System.out.println(d);
				d=d-17;
			} 
			while (d>=17);}
			
		}
	}


