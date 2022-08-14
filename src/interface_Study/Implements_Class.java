package interface_Study;

public class Implements_Class implements My_Interface  {

	public static void main(String[] args) {
		// To create object of Implements_Class
		Implements_Class i=new Implements_Class();
		System.out.println("--------------------");
		i.s1();
		System.out.println("--------------------");
		i.s2();
		System.out.println("--------------------");
		i.s3();
		System.out.println("--------------------");
		i.s4();
		System.out.println("--------------------");
		i.s5();
		System.out.println("--------------------");

		
	}

	@Override
	public void s1() {
		System.out.println("THis is s1 method from Interface.");
		
	}

	@Override
	public void s2() {
		System.out.println("THis is s2 method from Interface.");
		
	}

	@Override
	public void s3() {
		System.out.println("THis is s3 method from Interface.");
		
	}

	@Override
	public void s4() {
		System.out.println("THis is s4 method from Interface.");
		
	}
	public void s5() {
		
		System.out.println("This is s5 method from Implelements class.");
	}

}
