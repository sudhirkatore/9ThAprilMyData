package globalAndLocalVariables;

public class VariableType {
	
	// Non-static global variable
	int x=100; // variable declaration + assign the value (1+2)steps
	
	//Static Global variable
	static int y=111;  //variable declaration + assign the value (1+2)steps
	

	public static void main(String[] args)
	{
		VariableType v= new VariableType ();  // object create
		v.sample3();  // call non static method from same class
		sample4(); // call static  method from same class
		
		System.out.println("Running non-static Global variable "+v.x);// call non static global variable
		System.out.println("+++++++++++++++++++++++++++");
		
		System.out.println("Running static Global variable "+y);// call static Global variables
		System.out.println("+++++++++++++++++++++++++++");
	
		// From another class
		Variable1 V=new Variable1();
		System.out.println("Running non-static Global variable "+V.x);// Call non static global variable from another class
		System.out.println("Running static Global variable "+Variable1.y);
		
	}

	public void sample3()
	{int x=50; // Local variable
	int sum=x+25;
	System.out.println("+++++++++++++++++++++++++++");
	System.out.println("Running Local variable");
	System.out.println("Sum is= "+sum);
	System.out.println("+++++++++++++++++++++++++++");
		
	}
	
	public static void sample4()
	{
		int x=50;
		int sum=x+201;
		
		System.out.println("Sum is= "+sum);
		System.out.println("+++++++++++++++++++++++++++");
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
