package inheritance_Study;

public class SingleLEvel_Inheritance {

	public static void main(String[] args) {
		// 1. call Non static method
		
		Mother m=new Mother();// Create object of mother class
		Son s=new Son();// create object of son class
		
		m.nature();// call nature method from mother class
		s.mobile();//call mobile method from son class
		s.nature();// Using sons object call mother non static method
		
		System.out.println("============================");
		
		//2. call Static method
		Mother.look();// call look method from mother class
		Son.laptop();//call mobile method from son class
		Son.look();// Using sons class call mother static method
		
		System.out.println("============================");

	}

}
