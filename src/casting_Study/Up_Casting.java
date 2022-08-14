package casting_Study;

public class Up_Casting {

	public static void main(String[] args) {
		Father f=new Father();
		Son s=new Son();
		
		f.car();
		f.bike();
		System.out.println("=============");
		
		s.car();
		s.bike();
		System.out.println("=============");
		
		Father f1=new Son();
		f1.car();
		f1.bike();
		

	}

}
