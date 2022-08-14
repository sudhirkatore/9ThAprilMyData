package collection_Study;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();

		l.add(100);
		l.add(25);
		l.add(75.28);
		l.add("Sudhir");
		l.add("Sudhir");
		l.add('K');
		l.add(212);
		
		System.out.println(l);
		System.out.println("==================");
		System.out.println(l.size());
		System.out.println(l.get(2));
		System.out.println(l.peek());//retrives but does not remove head of the list.
		
		System.out.println(l);
		System.out.println(l.peekLast());//retrives but does not remove last element of the list
		System.out.println(l);
		System.out.println(l.poll());//retrives &  remove head of the list
		System.out.println(l);
		System.out.println(l.pollLast());//retrives &  remove last element of the list
		System.out.println(l);
		System.out.println("==================");
		
		//for loop
		System.out.println("----For loop----");
		for(int i=0;i<=4;i++)
		{
			System.out.println(l.get(i));
		}
		System.out.println("==================");
		
		System.out.println("----For each loop----");
		for(Object a:l)
		{
			System.out.println(a);
		}
		System.out.println("==================");
		
		System.out.println("----Iterator----");
		Iterator it=l.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("==================");
		
		
		System.out.println("----List Iterator----");
		ListIterator li=l.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		System.out.println("==================");
		
	
		
		
	}

}
