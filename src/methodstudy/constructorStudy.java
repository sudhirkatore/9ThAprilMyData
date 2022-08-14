package methodstudy;

public class constructorStudy 
{    // public Test()
	// {
	//default constructor--> complier will create at time of compilation
	//}

	
	float a;
    float b;
	public constructorStudy() // user defined constructor--> without parameter/with zero 
	//parameter
	{
		System.out.println("========================");

	System.out.println("Running user defined constructor");
	a=45.50f;
	b=54.52f;
	
	
		}
	
	
	
	
	

	public static void main(String[] args) 
	{
		constructorStudy c= new constructorStudy();// created object of class
		c.add();
		
		
		
		

	}
	public void add()
	{
	  
		
		float add=a+b;
		System.out.println("Addition is "+add);
		System.out.println("========================");
		
		
		
	}
	
	
	
	
	
	

}
