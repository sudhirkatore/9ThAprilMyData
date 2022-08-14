package Assignment;

public class SwitchCaseStudy {

	public static void main(String[] args)
	{
		//if today is Monday-->This is 1st day of week
		//.
		//.
		//.If today is Sunday-->This is 7th day of week
		
		String day="Sunday";
		switch (day) 
		{
		case "Monday": System.out.println("This is 1st day of week."); 
		break;
		
		case "Tuesday": System.out.println("This is 2nd day of week."); 
		break;
		
		case "Wednesday": System.out.println("This is 3rd day of week."); 
		break;
		
		case "Thursday": System.out.println("This is 4th day of week."); 
		break;
		
		case "Friday": System.out.println("This is 5th day of week."); 
		break;
		
		case "Saturday": System.out.println("This is 6th day of week."); 
		break;
		
		case "Sunday": System.out.println("This is 7th day of week."); 
		break;

		default: System.out.println("Please enter valid day between Monday-Sunday");
			break;
		

	}
	}

}
