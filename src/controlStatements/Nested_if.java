package controlStatements;

public class Nested_if {

	public static void main(String[] args) {
		// if card is insreted then entr pin
		//if pin is correct then-->teans success
		//else incorrect pin,transction is failed
		//else , please insert card
		
		
		boolean card=true;
		String pin="1234";
		
		if(card==true)
		{
			System.out.println("card is insreted then entr pin");
			
			if (pin=="1234")
			{
				System.out.println("pin is correct then-->teans success");;
			}
			else
			{
				System.out.println("incorrect pin,transction is failed");
			}
		}
		else
		{
			System.out.println("please insert card");
		}

	
	}
}
