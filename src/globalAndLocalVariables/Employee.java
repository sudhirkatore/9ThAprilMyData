package globalAndLocalVariables;

public class Employee {

	// name, empid, sal, desg, age, gender, phn...
	String emp_name;
	String emp_id;
	float emp_sal;
	String emp_desg;
	int emp_age;
	char emp_gen;
	long emp_phn;
	
	public void emp_info()
	{
		System.out.println("=========================================");
		System.out.println("Employee name = "+emp_name);
		System.out.println("Employee Id = "+emp_id);
		System.out.println("Employee Sallary = "+emp_sal);
		System.out.println("Employee Designation = "+emp_desg);
		System.out.println("Employee Age = "+emp_age);	
		System.out.println("Employee Gender = "+emp_gen);
		System.out.println("Employee Phn No. = "+emp_phn);
		
	}

}
