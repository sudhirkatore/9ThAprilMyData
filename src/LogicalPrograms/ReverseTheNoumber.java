package LogicalPrograms;

public class ReverseTheNoumber {

	public static void main(String[] args) 
	{
		int num=54897;
		
		String s = Integer.toString(num);
		String r="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		int revNum = Integer.parseInt(r);
		
		System.out.println("Original number is = "+num);
		System.out.println("Original number is = "+revNum);
	
		

	}

}
