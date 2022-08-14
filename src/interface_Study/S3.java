package interface_Study;

public class S3 implements S1,S2{

	public static void main(String[] args) {

		S3 s=new S3();

		System.out.println("-----Multiple Inheritance-----");
		s.s1info();
		System.out.println("++++++++++++++++++++++++++++++");
		s.s1Marks();
		System.out.println("==============================");
		s.s2info();
		System.out.println("++++++++++++++++++++++++++++++");
		s.s2marks();
		System.out.println("==============================");



	}

	@Override
	public void s2info() {
		String name="Sudhir Katore.";
		int roll=112;
		float age=25.7f;
		String dob="16-Nov-1997";
		System.out.println("Students 2nd Information.");
		System.out.println("Students name= "+name);
		System.out.println("Roll No.= "+roll);
		System.out.println("Age= "+age+" Y");
		System.out.println("Date Of Birth= "+dob);

		
	}

	@Override
	public void s2marks() {
		int phy=75;
		int che=65;
		int mat=60;
		System.out.println("Students 2nd Marks.");

		System.out.println("The marks of-");
		System.out.println("Physics= "+phy);
		System.out.println("Chemistry= "+che);
		System.out.println("Mathematics= "+mat);
	}

	@Override
	public void s1info() {
		String name="Satyam Katore.";
		int roll=122;
		float age=23.7f;
		String dob="03-Nov-1999";
		
		System.out.println("Students 1st Information.");

		System.out.println("Students name= "+name);
		System.out.println("Roll No.= "+roll);
		System.out.println("Age= "+age+" Y");
		System.out.println("Date Of Birth= "+dob);
		
	}

	@Override
	public void s1Marks() {
		int phy=79;
		int che=60;
		int mat=69;
		System.out.println("Students 1st Marks.");

		System.out.println("The marks of-");
		System.out.println("Physics= "+phy);
		System.out.println("Chemistry= "+che);
		System.out.println("Mathematics= "+mat);
		
	}

}
