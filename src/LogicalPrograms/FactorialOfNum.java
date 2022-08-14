package LogicalPrograms;

public class FactorialOfNum {

	public static void main(String[] args) 
	{
		int num=50;
		int fact=1;
		
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
			
		}
		System.out.println("Factorial of "+num+" is "+fact);

	}

}
