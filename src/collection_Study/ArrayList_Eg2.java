package collection_Study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Eg2 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Sudhir");
		al.add("Akshay");
		al.add("Vivek");
		al.add("Samir");
		al.add("Krupal");
		al.add("Rohit");
		al.add("Sudhir");
	
		System.out.println(al);
		System.out.println("==================");
		
		//size & get method
		System.out.println("Size = "+al.size());
		System.out.println("Get ="+al.get(3));
		System.out.println("==================");
		
		
		//3)Indexof & LastIndexof
	    System.out.println(al.indexOf("Akshay"));
	    System.out.println(al.lastIndexOf("Sudhir"));
		System.out.println("==================");
				
		//4) contains & remove method
		System.out.println(al.contains("Krupal"));
		System.out.println(al.remove(6));
		System.out.println(al);
		System.out.println("==================");
		
		//add method
		al.add("Ram");
		System.out.println(al);
		al.add(3, "Sham");
		System.out.println(al);
		System.out.println("==================");
						
		//Static or hard coding;
		System.out.println("----Static or Hard Coding----");
				System.out.println(al.get(0));
				System.out.println(al.get(1));
				System.out.println(al.get(2));
				System.out.println(al.get(3));
				System.out.println(al.get(4));
				System.out.println(al.get(5));
				System.out.println(al.get(6));
				System.out.println(al.get(7));
				System.out.println("==================");
				
				//for loop
				for(int i=0;i<=7;i++)
				{
					System.out.println(al.get(i));
				}
				System.out.println("==================");
				
				
		//Dynamic coding
				System.out.println("----Dynamic Coding----");
				
				for(int i=0;i<=al.size()-1;i++)
				{
					System.out.println(al.get(i));
				}
				System.out.println("==================");
		
		
		//for each loop
				System.out.println("----For each Loop----");
				for(String b:al)
				{
					System.out.println(b);
				}
				System.out.println("==================");
		
				//Iterator
				System.out.println("----Iterator----");
				Iterator<String> it = al.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
				System.out.println("==================");
				
				
				//List Iterator
				System.out.println("----List Iterator----");
				ListIterator<String> li = al.listIterator();
				while(li.hasNext())
				{
					System.out.println(li.next());
				}
				System.out.println("==================");
		
		
		
		
		
		
		

	}

}
