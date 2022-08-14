package string;

public class StringStudy1 {

	public static void main(String[] args) {
		
		
		
		String s1="Poonam";
		String s2="Poonam";
		String s3=s1;   //String literal
		String s4=new String ("Poonam");//Create String object
		String s5=new String ("Poonam");
		
		System.out.println(s1==s5);
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s4==s5);
		System.out.println("===================");
		System.out.println(s4.equals(s5));
		System.out.println(s1.equals(s3));
		
		
		

	}

}
