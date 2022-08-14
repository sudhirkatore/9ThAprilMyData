package interface_Study;

public class final_Use {
	public static void main(String[] args) {
		
		// Use of final keyword-->1. before variable
		//2. before method 
		//3. before class
		// final keyword--> non-access modifier, impossible to inherit or override
		
		
		int a=10;
		System.out.println(a);
		a=a+10;
		System.out.println(a);
		
		//1. before variable
		final int b=25;
		System.out.println(b);
		
	}

}
