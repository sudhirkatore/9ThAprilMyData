package this_superKeyword;

public class Super_keyword extends super_1 {
	String name="Shri A. Katore.";

	public static void main(String[] args) {
		
		Super_keyword s=new Super_keyword();
		s.test();
		

	}
	

	public void test() {
		String name="Satyam A. Katore.";
		
		System.out.println("======================");
		System.out.println("My name is = "+name+"(Local value from Same class)");// calling local value from same class
		System.out.println("======================");
		System.out.println("My name is = "+this.name+"(Global value from Same class)");// calling global value from same class
		System.out.println("======================");
		System.out.println("My name is = "+super.name+"(Global value from Super class)");// Calling Global value from Super class
		System.out.println("======================");
	}

}
