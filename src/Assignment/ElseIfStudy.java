package Assignment;

public class ElseIfStudy {

	public static void main(String[] args) {
		// // if its summer then its very hot
		//if its rainy then its raining heavily
		//if its winter then its very cold
		//else Invalid season
		
		String season;
		season="rainy";
		
		 if(season=="summer")
		 {
			System.out.println("Its very hot."); 
			
		 }
		
		 else if (season=="winter")
		 {
			 System.out.println("Its very cold");
		 }

		 else if (season=="rainy")
		 {
			 System.out.println("Its raining heavily");
			 
		 }
		 
		 else
		 {
			 System.out.println("Enter valid season");
		 }
		 
	}

}
