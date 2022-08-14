package controlStatements;

public class ElseIfStudy {

	public static void main(String[] args) 
	{
		// If i got >=90 I am in Distinction.
		//else if i got >=66 & <90 I  am in 1st class.
		//else if i got >=50 & <66 I am in 2nd class.
		//else if i got >=40 & <50 I am in pass class.
		//else i am fail.
		
		int marks=90;
		
		 if (marks>=90)
		 {
			 System.out.println("I am in Distinction.");
		 }

		 else if(marks>=66 & marks<90)
		 {
			 System.out.println("I am in 1st class.");
		 }

		 else if(marks>=50 & marks<66)
		 {
			 System.out.println("I am in 2nd class.");
		 }
		 
		 else if (marks>=40 & marks<50)
		 {
			 System.out.println("I am in pass class");
			 
		 }
		 
		 else
		 {
			 System.out.println("I am fail.");
		 }
	}

}
