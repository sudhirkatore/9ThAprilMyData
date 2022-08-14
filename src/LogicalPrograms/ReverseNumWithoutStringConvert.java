package LogicalPrograms;

public class ReverseNumWithoutStringConvert {

	public static void main(String[] args)
	{
		int num=451;
		int revNum=0;
		
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			revNum=revNum*10+rem;
		}
		System.out.println(revNum);

	}

}
