package this_superKeyword;

public class This_Keyword {
	
	
	// Non static Global Variables
		
		int a=121;
		
	

	public static void main(String[] args) {
		This_Keyword t=new This_Keyword();
		t.test();

	}
	public void test() {
		//Non Static local Variable
		int a=150;
		
		int sum=a+10;
		
		int sum1=this.a+10;
		
		
		System.out.println("The Local value of a= "+a);
		System.out.println("The sum = "+sum);
		System.out.println("==========================");
		
		System.out.println("The Global value of a = "+this.a);
		System.out.println("The sum1 = "+sum1);
		System.out.println("==========================");
	}

}
