package generalization_Study;

public class Banking {

	public static void main(String[] args) {


		
		SBI s=new SBI();
		BOI b=new BOI();
		Axis a=new Axis();
		
		System.out.println("==================");
		s.deposit();
		s.loan();
		s.transfer();
		
		System.out.println("==================");

		b.deposit();
		b.loan();
		b.transfer();
		
		System.out.println("==================");

		a.deposit();
		a.loan();
		a.transfer();

		
		
		
		

	}

}
