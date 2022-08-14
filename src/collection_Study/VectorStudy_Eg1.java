package collection_Study;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy_Eg1 {

	public static void main(String[] args) {

		Vector v=new Vector();
		
		v.add(100);
		v.add('A');
		v.add("Sudhir");
		v.add(10.25);
		v.add("Sai");
		v.add('G');
		v.add("Sai");
		
		System.out.println(v);
		System.out.println("==============");
		
		//size & get method
		System.out.println("Size = "+v.size());
		System.out.println("Get ="+v.get(5));
		System.out.println("==================");
		
		
		//3)Indexof & LastIndexof
	    System.out.println(v.indexOf("Sai"));
	    System.out.println(v.lastIndexOf("Sai"));
		System.out.println("==================");
				
		//4) contains & remove method
		System.out.println(v.contains("Sham"));
		System.out.println(v.remove(6));
		System.out.println(v);
		System.out.println("==================");
		
		//add method
		v.add("Ram");
		System.out.println(v);
		v.add(6, "Sham");
		System.out.println(v);
		System.out.println("==================");
						
		//Static or hard coding;
		System.out.println("----Static or Hard Coding----");
		System.out.println(v.get(0));
		System.out.println(v.get(1));
		System.out.println(v.get(2));
		System.out.println(v.get(3));
		System.out.println(v.get(4));
		System.out.println(v.get(5));
		System.out.println(v.get(6));
		System.out.println(v.get(7));
		System.out.println("==================");
		
				
		//for loop
		for(int i=0;i<=7;i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("==================");
				
				
		//Dynamic coding
		System.out.println("----Dynamic Coding----");
			
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("==================");
		
		
		//for each loop
		System.out.println("----For each Loop----");
		for( Object c:v)
		{
			System.out.println(c);
		}
		System.out.println("==================");
		
		//Iterator
		System.out.println("----Iterator----");
		 Iterator it = v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("==================");
				
				
		//List Iterator
		System.out.println("----List Iterator----");
		 ListIterator li = v.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("==================");
		
		
		//Enumeration
		System.out.println("----Enumeration----");
		Enumeration en = v.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		System.out.println("==================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
