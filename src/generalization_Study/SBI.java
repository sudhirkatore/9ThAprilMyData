package generalization_Study;

public class SBI implements RBI  {

	@Override
	public void deposit() {
		System.out.println("SBI  Bank deposite- 8.7%");

		
	}

	@Override
	public void loan() {
		System.out.println("SBI  loan IR- 8.8%");
		
	}

	@Override
	public void transfer() {
		System.out.println("SBI  have CDM");

		
	}

}
