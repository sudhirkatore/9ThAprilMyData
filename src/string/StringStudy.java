package string;

public class StringStudy {

	public static void main(String[] args) {
		String s="Sudhir Ashok Katore";// Create object without using new keyword
		String s1="Satyam Ashok Katore";// Create object with using new keyword

		//1) Length method use
		System.out.println(s.length());// we can not store the value --> Single time use
		System.out.println(s1.length());
		System.out.println("===============");
		
		 int a = s.length();// We use variable to store value-->Use many times
		int b=s1.length();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("==============");
		
		
		//2) toUppercase use
		System.out.println(s.toUpperCase());
		System.out.println(s1.toUpperCase());
		System.out.println("==============");
		
		
		//3) toLowercase use
		System.out.println(s.toLowerCase());
		System.out.println(s1.toLowerCase());
		System.out.println("==============");
		
		//4) equals to use
		String p0="Sudhir";
		String p1="Sudhir";
		String p2=new String ("Sudhir");
		String p3=new String ("Sudhir");
		
		System.out.println(p0==p1);
		System.out.println(p2==p3);
		System.out.println(p1==p2);
		System.out.println(p3==p0);
		System.out.println("==============");

		System.out.println(p0.equals(p1));
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		System.out.println(p3.equals(p0));
		System.out.println("==============");
		
		
		
		//5) equalsIgnoreCase use
		System.out.println(p0.equalsIgnoreCase(p1));
		
		boolean A=p0.equalsIgnoreCase(p1);
		System.out.println(A);
		System.out.println("==============");

		
		//6) contains use
		
		String a1="Sangavi";
		String a2="avi";
		String a3="ang";
		System.out.println(a1.contains(a2));
		System.out.println(a2.contains(a1));
		
	    System.out.println(a2.contains(a3));
		System.out.println("==============");

	    
	    
	    
	    //7) isEmpty use
	    String g=" ";
	    String g1="";
	    String g2="SK";
	    System.out.println(g.isEmpty());
	    System.out.println(g1.isEmpty());
	    System.out.println(g2.isEmpty());		
	    System.out.println("==============");
	    
	    //8) charAt use
	    String s5="Omsairam";
	    System.out.println(s5.charAt(2));
	    System.out.println(s5.charAt(0));
	    System.out.println(s5.charAt(5));
	   // System.out.println(s5.charAt(10));
		System.out.println("==============");
		
		//9) startWith use
		//10) endWith use
		
		String f1="KTM220";
		
		System.out.println(f1.startsWith("KTM"));
		System.out.println(f1.startsWith("220"));
		System.out.println(f1.endsWith("220"));
		System.out.println(f1.endsWith("KTM"));
		System.out.println("==============");
		
		//11) subString method use
		String n="SudhirA.Katore";
		System.out.println(n.substring(8));
		System.out.println(n.substring(0, 6));
		System.out.println(n.substring(6, 8));
		System.out.println("==============");

		//12) concat Use
		
		String m="Sudhir ";
		String m1="A ";
		String m2="Katore.";
		
		System.out.println(m.concat(m2));
		System.out.println(m.concat(m1).concat(m2));
		System.out.println("==============");

		//13) index of use
		
		String o="Om Sai Ram";
		
		System.out.println(o.indexOf('S'));
		System.out.println(o.indexOf('m'));
		System.out.println(o.lastIndexOf('m'));
		System.out.println(o.indexOf('S', 2));
		System.out.println(o.indexOf('m', 0));
		System.out.println(o.indexOf('m', 7));
		System.out.println("==============");
		
		
		// 15) replace use
		String k="Functional Testing.";
		
		System.out.println(k.replace("Functional", "Non-functional"));
		System.out.println(k.replace('F', 'f'));
		System.out.println(k.replace('T' , 't'));
		
		System.out.println("==============");
		System.out.println("-----Thank You-----");
		


		

		
		


	
	
	
	
		
		
		
		
		
		
		

	}

}
