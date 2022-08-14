package interface_Study;

public interface Mother 
{
	void look();
	void nature();
	
	default void love() {
		System.out.println("Mothers Love.");
	}
	
	static void love1() {
		System.out.println("Mothers Love.");
	}
	
	
	

}
