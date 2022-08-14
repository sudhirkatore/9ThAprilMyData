package generalization_Study;

public class Axis implements RBI {

	@Override
	public void deposit() {
		System.out.println("Axis Bank deposite- 9.8%");
		
		
	}

	@Override
	public void loan() {
		System.out.println("Axis loan IR- 9.5%");
		
	}

	@Override
	public void transfer() {
		System.out.println("Axis have CDM");
		
	}

}
