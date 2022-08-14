package Assignment;

public class methodParameterStudy1 {

	public static void main(String[] args) {
		studentmarks();// Static regular method without parameter call from same class

		studentmarks(60, 65, 70, 75);
	}

	public static void studentmarks() {
		int marathi;
		int hindi;
		int english;
		int sanskrit;
		
		marathi=65;
		hindi=70;
		english=75;
		sanskrit=80;
		
		System.out.println("*********************************");
		System.out.println("Marks of Marathi= "+marathi);
		System.out.println("Marks of Hindi= "+hindi);
		System.out.println("Marks of English= "+english);
		System.out.println("Marks of Sanskrit= "+sanskrit);
		System.out.println("*********************************");
		
		
	}
	
	public static void studentmarks(int marathi, int hindi, int english, int sanskrit)
	{
		System.out.println("*********************************");
		System.out.println("Marks of Marathi= "+marathi);
		System.out.println("Marks of Hindi= "+hindi);
		System.out.println("Marks of English= "+english);
		System.out.println("Marks of Sanskrit= "+sanskrit);
		System.out.println("*********************************");
		
		
	}
	
	
	
}
