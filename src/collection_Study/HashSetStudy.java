package collection_Study;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args)
	{ //1. doesn't allow duplicate 
//		2. allow only 1 null value(except treeset)
//		3. order of insertion-random/asscending/maintain insertion
//		4. storage type- hashtable
		
//		5. no default capacity
//		6. DS: Hashtable	
//		best choice: To remove duplicate elements when order of insertion is not mandatory.


	
		HashSet hs=new HashSet();
		hs.add(512);
		hs.add("Sham");
		hs.add(null);
		hs.add(null);
		hs.add("Sham");
		hs.add(50.512);
		hs.add('A');
		hs.add("Sudhir");
		hs.add(true);
		hs.add("Sangamner");
		
		System.out.println(hs);
		System.out.println("================");
		System.out.println(hs.size());
		//System.out.println(hs.get(2)); get method is not available
		System.out.println("================");
		
		
		//does not spport for loop---->get method is not available
		
		System.out.println("----For each loop----");
		for(Object b:hs)
		{
			System.out.println(b);
		}
		System.out.println("================");
		
		System.out.println("----Iterator----");
		Iterator it=hs.iterator();
		
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
