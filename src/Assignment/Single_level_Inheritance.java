package Assignment;

public class Single_level_Inheritance {

	public static void main(String[] args) {
		// 1.Non static method
		Dad d=new Dad();
		Son s=new Son();
		
		d.dad();
		s.son();
		s.dad();
		System.out.println("==========================");
		
		//2.Static method
		Dad.dad1();
		Son.son1();
		Son.dad1();
		System.out.println("==========================");
		
		 // 3. call global variable
		
		//A) Non static variable
		int sum=d.a+s.b;
		System.out.println("The addition of non static Dad & Son is = "+sum);
		
		//B) Static Variable
		int add=Dad.a1+Son.b1;
		System.out.println("The addition of static Dad & Son is = "+add);
		
		
		System.out.println("Using son object call dad non static variable= "+s.a);
		System.out.println("Using son object call dad static variable= "+Dad.a1);
		

	}

}
