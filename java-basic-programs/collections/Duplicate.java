package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
//import java.util.Collection;
//import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
 

public class Duplicate 
{
	public static void main(String[] args) 
	{
		List<Integer> l1= new ArrayList<Integer>(Arrays.asList(12,34,56,76,12,34,12,45));
		List<Integer> l2= new ArrayList<Integer>();
		for(int i=0;i<l1.size();i++) 
		{
		 if(!l2.contains(l1.get(i))) {
			 l2.add(l1.get(i));
		 }
		}
		System.out.println(l2);
		Set<Integer> s1=new TreeSet<Integer>(l1);                                                                                                     
		System.out.println(s1);
	}
}

		
		
		
//		for(Object o1:c1) 
//		{
//			System.out.println(o1);
//		}
//		System.out.println("----------------------------");
//		Iterator it=c1.iterator();
//		while(it.hasNext()) 
//		{
//			 it.next();
//		}
	 
		
		
		
	 
