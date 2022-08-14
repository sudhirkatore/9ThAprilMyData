package polymorphism_Study;

public class Compiletime_Polymorphism_Method_Overloading {

	public static void main(String[] args) {
		Compiletime_Polymorphism_Method_Overloading co=new Compiletime_Polymorphism_Method_Overloading();
		co.calculation();
		co.calculation(100);
		co.calculation(100, 200);
		
		
	}
	
	public void calculation()
	{
		int x=10; int y=20;
		int sum= x+y;
		int sub= x-y;
		int mul=x*y;
		System.out.println("Compiletime_Polymorphism_");
		System.out.println("===========================================");
		System.out.println(" Non Static Method with zero parameter");
		System.out.println("Sum = "+sum);
		System.out.println("Sub = "+sub);
		System.out.println("Mul = "+mul);
		System.out.println("===========================================");
		
	}
	public void calculation(int a)
	{int x=10; int y=20;
	int sum= x+y+a;
	int sub= a-x-y;
	int mul=x*y*a;
	
	System.out.println("===========================================");
	System.out.println(" Non Static Method with Single parameter");
	System.out.println("Sum = "+sum);
	System.out.println("Sub = "+sub);
	System.out.println("Mul = "+mul);
	System.out.println("===========================================");
		
	}
	public void calculation(int a, int b)
	{int x=10; int y=20;
	int sum= x+y+a+b;
	int sub= a-b-x-y;
	int mul=x*y*a*b;
	
	System.out.println("===========================================");
	System.out.println(" Non Static Method with Double parameter");
	System.out.println("Sum = "+sum);
	System.out.println("Sub = "+sub);
	System.out.println("Mul = "+mul);
	System.out.println("===========================================");
		
	}
	
	

}
