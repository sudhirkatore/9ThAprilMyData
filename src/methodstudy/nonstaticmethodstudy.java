package methodstudy;

public class nonstaticmethodstudy {

	public static void main(String[] args) 
	{ // Assign object for non-static regular method.
		// classname objectname= new classname();
		nonstaticmethodstudy n= new nonstaticmethodstudy();
		
		//Objectname.method();
		n.test();// call from same class
		
		sample s= new sample();// Assign obj from diff class.
		s.test1();
		

	}

	public void test() // Non-static regular method-->complete method-->Method have body
	{
		System.out.println("Hi i am non-static regular method from same class");
		
	}
	
	
	
}
