package generalization_Study;

public class BOI implements RBI  {

	@Override
	public void deposit() {
		System.out.println("BOI Bank deposite- 9.0%");
		
	}

	@Override
	public void loan() {
		System.out.println("BOI loan IR- 8.5%");
		
	}

	@Override
	public void transfer() {
		System.out.println("BOI have CDM");
		
	}

}
