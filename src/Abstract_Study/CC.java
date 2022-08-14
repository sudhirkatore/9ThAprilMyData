package Abstract_Study;

public  class CC extends A{
	
public static void main(String[] args) {
		
		CC c=new CC();
		c.p1();
		c.p2();
		c.p3();
		c.p4();
		c.test();
		
		
	}
	
	// completing incomplete method of abstract class

	
	public void test()
	{
		System.out.println("This is Running Test method");
	}

	@Override
	public void p4() {
		System.out.println("This is Runnig p4 method.");
		
	}

}
