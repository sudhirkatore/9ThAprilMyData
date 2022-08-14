package casting_Study;

public class Casting {

	public static void main(String[] args) {

		//1. Implicit casting( lower data size ---> higher data size)
		int a=10;
		System.out.println(a);
		
		float b=a;
		System.out.println(b);
		
		System.out.println("========================");
		
		//2. Explicit casting (Higher data size ---> lower data size)
		
		double c=22.123456546812d;
		System.out.println(c);
		
		float d=(float) c;
		System.out.println(d);
		
		
		
		
	}

}
