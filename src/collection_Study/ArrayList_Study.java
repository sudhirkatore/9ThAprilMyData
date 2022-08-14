package collection_Study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Study {

	public static void main(String[] args) {
		
		//Create Object of IC ArrayList
		ArrayList al=new ArrayList();//Array list is an Implementation class of an List Interface 
		
		al.add("Sudhir");
		al.add(25);
		al.add(55.23);
		al.add('A');
		al.add("Sudhir");
		al.add('K');
		al.add(1000);
		
		System.out.println(al);
		System.out.println("==================");
		
		//1) Size method
		System.out.println("Size of Array list= "+al.size());
		System.out.println("==================");
		
		//2) get method
		System.out.println(al.get(4));
		System.out.println("==================");
		
		//3)Indexof & LastIndexof
		System.out.println(al.indexOf('K'));
	    System.out.println(al.lastIndexOf("Sudhir"));
		System.out.println("==================");
		
		//4) contains & remove method
		System.out.println(al.contains('A'));
		System.out.println(al.remove(3));
		System.out.println(al);
		System.out.println("==================");
		
		//5) add method
		al.add("Sai");
		System.out.println(al);
		al.add(3, "Om");
		System.out.println(al);
		System.out.println("==================");
		
		
		//Static or hard coding;
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		System.out.println(al.get(4));
		System.out.println(al.get(5));
		System.out.println(al.get(6));
		System.out.println(al.get(7));
		System.out.println("==================");
		
		System.out.println("----Incremental----");
		for(int i=0;i<=7;i++)
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		System.out.println("==================");
		System.out.println("----Decremental----");
		
		for(int i=7;i>=0;i--)
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		
		System.out.println("==================");
		
		//Dynamic coding
		
		System.out.println("----Incremental----");
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		System.out.println("==================");
		
        System.out.println("----Decremental----");
		
		for(int i=al.size()-1;i>=0;i--)
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		
		System.out.println("==================");
		
		//for each loop
		System.out.println("----For Each Loop----");
		for(Object a:al)
		{
			System.out.println(a);
		}
		System.out.println("==================");
		
		
		
		//Iterator
		System.out.println("----Iterator----");
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("==================");
		
		
		System.out.println("----List Iterator----");
		ListIterator li = al.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("==================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
