package constructorStudy;

public class ConstructorWithParameter
{//1. Declaration 
	int a;
	int b;
	int c;
	public ConstructorWithParameter()// Create Constructor without parameter
	{a=45;
	b=75;
	c=88;
	 System.out.println("Running user defined constructor without parameter.");
		
	}
	
	
	public ConstructorWithParameter(int x)// with single parameter
	{a=x;
	
		System.out.println("Running user defined constructor with single parameter");
	}
	
	
	public ConstructorWithParameter(int x, int y)// with double parameter
	{a=x;
	b=y;
	
	
		System.out.println("Running user defined constructor with two parameter");
	}
	
	
	public ConstructorWithParameter(int x, int y, int z)// with three parameter
	{a=x;
	b=y;
	c=z;
	
	
	
		System.out.println("Running user defined constructor with three parameter");
	}
	
	
	

	public static void main(String[] args)
	{ ConstructorWithParameter c= new ConstructorWithParameter();
	c.math();
	
	ConstructorWithParameter c1= new ConstructorWithParameter(100);
	c1.math();
	
	ConstructorWithParameter c2= new ConstructorWithParameter(100,200);
	c2.math();
	
	ConstructorWithParameter c3= new ConstructorWithParameter(100,200,300);
	c3.math();
	
		

	}
	
	public void math()// Non static regular method-->without parameter
	{int sum=a+b+c;
	int sub=a-b-c;
	int mul=a*b*c;
	
	
	    System.out.println("**********************************");
		System.out.println("Addition is= "+sum);
		System.out.println("Subtraction is= "+sub);
		System.out.println("Multiplication is= "+mul);
		System.out.println("**********************************");
	}
	
	
	
	
	

}
