package LogicalPrograms;

public class ArmstrongNum {

	public static void main(String[] args)
	{
		int num=153;
		int sum=0;
		
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			
			sum=sum+(rem*rem*rem);
			

		}
		if(num==sum)
		{
			System.out.println("Given num is arm strong num.");
		}
		else
		{
			System.out.println("Given num is not arm strong num.");
		}

	}

}
