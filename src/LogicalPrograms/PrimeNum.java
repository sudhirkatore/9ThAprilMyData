package LogicalPrograms;

public class PrimeNum {

	public static void main(String[] args) 
	{
		int num=12;
		int counter=0;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				counter++;
				break;
			}
		}
		
		if(counter==1)
		{
			System.out.println("Given number is not a prime no.");
		}
		else
		{
			System.out.println("Given number is  a prime no.");
		}

	}

}
