package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class list_ {
public static void main(String[] args) 
{
	//Ways to create 
	List l1=new ArrayList();
	List<Integer> l2= new ArrayList();
	List l3=Arrays.asList(1,2,3,4);
	List<Integer> l4=new ArrayList(Arrays.asList(12,13,14,15));
	List<String> l5=new ArrayList(Arrays.asList("Asbj","Bavitha"));
	for(int i=0;i<l4.size();i++) {
		System.out.println(l4.get(i));
	}
	System.out.println("//////////////////////////////////");
	for(int i=l4.size()-1;i>=0;i--) {
		System.out.println(l4.get(i));
	}
	System.out.println("by FOREACH LOOP ");
	for(String s1:l5) {
		System.out.println(s1);
	}
	System.out.println("by Iterator ");
	Iterator il=l5.iterator();
	while(il.hasNext()) {
		System.out.println(il.next());
		
	}
	while(il.hasNext())//returns false because its pointing at the last
		{
		System.out.println(il.next());
	}//this while will not work 
	System.out.println("-------------------");
	System.out.println(l5);
	System.out.println("by FOR LOOP");
	for(Iterator i2=l5.iterator();i2.hasNext();)
	{
		System.out.println(i2.next());
	}
	
	System.out.println("-------------------");
	
	ListIterator ilt=l5.listIterator();
	
	while(ilt.hasNext()) 
	{
		ilt.next();
	}
	System.out.println("To rverse the given collection by list");
	System.out.println(" ---------Reverse List------------ ");
	System.out.println();
	while(ilt.hasPrevious()) 
	{
		System.out.println(ilt.previous());
	}
}
}
