package controlStatements;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		String username="Sudhir";
		String password="sudhir@123";
		
		if(username=="Sudhir")
		{
			System.out.println("Username is correct plz enter password");
		
		if(password=="sudhir@123")
		{
			System.out.println("Password is correct,Login successful ");
		}
		else {
			System.out.println("Wrong password, Login failed");
		}
		}
		else
		{
			System.out.println("Incorrect username, unable to login");
		}
		
	}

}
