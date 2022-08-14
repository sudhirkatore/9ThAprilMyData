package interface_Study;

public class Son_multiple_Inheritance implements Mother,Father {

	public static void main(String[] args) {
		Son_multiple_Inheritance s=new Son_multiple_Inheritance();
		System.out.println("-----Multiple Inheritance-----");
		System.out.println("(Super Class-1)");
		s.money();
		s.attitude();
		System.out.println("========================");
		System.out.println("(Super Class-2)");
		s.look();
		s.nature();
		System.out.println("========================");
		System.out.println("(Sub Class)");
		s.laptop();
		System.out.println("========================");

		s.love();
		System.out.println("========================");
		Mother.love1();
		Father.love1();
		

	}

	@Override
	public void money() {
		System.out.println("Fathers Money.");
		
		
	}

	@Override
	public void attitude() {
		System.out.println("Fathers Attitude.");
	}

	@Override
	public void look() {
		System.out.println("Mothers Look.");
	}

	@Override
	public void nature() {
		System.out.println("Mothers Love. ");
		
	}
	
	public void laptop() {
		System.out.println("Sons own method.");
	}

	@Override
	public void love() {
		Mother.super.love();
		Father.super.love();
		
	}

}
