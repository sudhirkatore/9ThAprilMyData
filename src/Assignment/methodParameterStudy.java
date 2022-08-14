package Assignment;

public class methodParameterStudy {

	public static void main(String[] args) {
		methodParameterStudy me= new methodParameterStudy();// object creation
		me.studentinfo();//non static method without parameter call from same class
		
		me.studentinfo("Poonam", 24.5f, 'F',55.56d, 654321);

	}
	
	  public void studentinfo()//Non static regular method without parameter.
	  {
		  String name;
		  float age;
		  char gender;
		  double weight;
		  int rollno;
		  
		  name="Sudhir ";
		  age=25.6f;
		  gender='M';
		  weight=57.85;
		  rollno=123456;
		  
		  System.out.println("=========================");
		  System.out.println("My name = "+name);
		  System.out.println("My age = "+age);
		  System.out.println("My gender = "+gender);
		  System.out.println("My weight = "+weight);
		  System.out.println("My Roll No = "+rollno);
		  System.out.println("=========================");
		  
		  
	  }
		
		public void studentinfo(String name, float age, char gender, double weight, int rollno) 
		{
			System.out.println("=========================");
			  System.out.println("My name = "+name);
			  System.out.println("My age = "+age);
			  System.out.println("My gender = "+gender);
			  System.out.println("My weight = "+weight);
			  System.out.println("My Roll No = "+rollno);
			  System.out.println("=========================");  
			
		}
		
		
		
		
		
	
}
