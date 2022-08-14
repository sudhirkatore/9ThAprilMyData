package LogicalPrograms;

public class whiteSpaceFromString {

	public static void main(String[] args) 
	{
		String s="I am Ram";
		int counter=0;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char blank = s.charAt(i);
			if(blank==' ')
			{
				counter++;
			}
		}
	
		System.out.println("The blank space in "+s+" is "+counter);

	}

}
