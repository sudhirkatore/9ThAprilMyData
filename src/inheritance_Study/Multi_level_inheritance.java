package inheritance_Study;

public class Multi_level_inheritance {

	public static void main(String[] args)
	{   //1. Call Non static Method 
		Son s=new Son();// Create Object
		
		s.receipe();//son object call grand mother class
		s.nature();//son object call  mother class
		s.mobile();//son object call son class
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		//2. Call Static method
		Son.stories();//son object call grand mother class
		Son.look();//son object call grand class
		Son.laptop();//son object call son class
	}

}

