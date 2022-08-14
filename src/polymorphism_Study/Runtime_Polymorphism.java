package polymorphism_Study;

public class Runtime_Polymorphism extends Superclass{

	public static void main(String[] args) {
		Runtime_Polymorphism r=new Runtime_Polymorphism ();
		r.Info();//Method Overriding
		
		r.Info("KAtore Satyam A.");

	}

	public void Info()
	{ String name="Katore Sudhir A.";
	float age=25.6f;
	
	
	System.out.println("======================================");
	System.out.println("This is super class info");
		System.out.println("My name is "+name);
		System.out.println("My age is "+age );
		System.out.println("======================================");
	}
	
	public void Info(String name)
	{ 
	float age=25.6f;
	
	
	System.out.println("======================================");
	System.out.println("This is super class info");
		System.out.println("My name is "+name);
		System.out.println("My age is "+age );
		System.out.println("======================================");
	
	
}
}