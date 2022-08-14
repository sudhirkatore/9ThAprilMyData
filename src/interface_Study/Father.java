package interface_Study;

public interface Father
{
	void money();
	void attitude();
	
	default void love() {
		System.out.println("Fathers Love.");
	}
	
	static void love1() {
		System.out.println("Fathers Love.");
	}

}
