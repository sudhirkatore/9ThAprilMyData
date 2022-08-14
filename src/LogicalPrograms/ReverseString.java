package LogicalPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args)
	{


Scanner sc=new Scanner(System.in);
		
		// String int float to char
		
		System.out.println("Enter String value");
		String s = sc.next();
		String p="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			p=p+s.charAt(i);
		}
		System.out.println("Reverse String is "+p);
		
		

	}

}
