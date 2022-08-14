package inheritance_Study;

public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		Grandmother g=new Grandmother();// create object of grandmother class
		System.out.println("=========================");
		g.receipe();
		Grandmother.stories();
		System.out.println("=========================");
		
		Father f=new Father();
		f.attitude();
		Father.height();
		f.receipe();
		Father.stories();
		System.out.println("=========================");
		
		Mother m=new Mother();
		m.nature();
		Mother.look();
		m.receipe();
		Mother.stories();
		System.out.println("=========================");

	}

}
