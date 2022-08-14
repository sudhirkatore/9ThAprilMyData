package Assignment;

public class SwitchCsaeStudy1 {

	public static void main(String[] args) {
		// if grade is A--> Marks is >=90
		// if grade is B--> Marks is >=75 & <90
		// if grade is c--> Marks is >=60 & <75
		// if grade is D--> Marks is >=35 & <45
		// if grade is E--> Marks is <35
		
		
		char grade='A';
		switch (grade)
		{
		case 'A': System.out.println("Marks is >=90");
		break;
		
		case 'B': System.out.println("Marks is >=75 & <90");
		break;
		
		case 'C': System.out.println("Marks is >=60 & <75");
		break;
		
		case 'D': System.out.println("Marks is >=35 & <45");
		break;
		
		case 'E': System.out.println("Marks is <35");
		break;
		
		

		default: System.out.println("Please enter grade between A-E");
			break;
		}
		
	}

}
