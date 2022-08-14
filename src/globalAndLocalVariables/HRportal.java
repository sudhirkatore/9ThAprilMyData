package globalAndLocalVariables;

public class HRportal {

	public static void main(String[] args) 
	{
		Employee Sudhir=new Employee();// object create
		Sudhir.emp_name="Sudhir K.";//Initilize the value
		Sudhir.emp_id="JBS20002661";
		Sudhir.emp_sal=29300.2f;
		Sudhir.emp_desg="Research Associate";
		Sudhir.emp_age=26;
		Sudhir.emp_gen='M';
		Sudhir.emp_phn=7387402836l;
		
		
		Employee Ram=new Employee();
		Ram.emp_name="Ram K.";
		Ram.emp_id="JBS20002665";
		Ram.emp_sal=298300.2f;
		Ram.emp_desg="Research Associate";
		Ram.emp_age=29;
		Ram.emp_gen='M';
		Ram.emp_phn=7387530836l;
		
		// call non static Global Variables
		Sudhir.emp_info();
		Ram.emp_info();
		
	}

}
