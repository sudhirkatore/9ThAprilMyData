package Access_Specifier;

public class Specifier  {

	public static void main(String[] args) {
		
		p1();// Private can be access with in the class
		p2();// Public can be access with in the project
		p3();// Default can be access with in the package 
		p4();// Private can be access with in the package & also outside of package by using Inheritans condition

	}
	
	private static void p1()
	{System.out.println("==========================================");
		System.out.println("This is rinning Private Access_Specifier");
	}
	
	public static void p2()
	{System.out.println("==========================================");
		System.out.println("This is runnig Public Access_Specifier");
	}

	static void p3()
	{System.out.println("==========================================");
		System.out.println("This is running Default Access_Specifier");
	}
	protected static void p4 ()
	{System.out.println("==========================================");
		System.out.println("This is running Protected Access_Specifier");
	}
	
}
