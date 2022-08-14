package LogicalPrograms;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		// String int float to char
		
		System.out.println("Enter first numeric value");
		int number1 = sc.nextInt();
		
		
		System.out.println("Enter second numeric value");
		int number2 = sc.nextInt();
		
		int sum=number1+number2;
		
		System.out.println("The first noumber is "+number1);
		
		System.out.println("The second noumber is "+number2);
		
		
		System.out.println("Addition of two number are  "+sum);

	}

}
