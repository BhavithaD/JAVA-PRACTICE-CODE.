package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import encapsulation.Employee;

public class Retrive 
{
public static void main(String[] args) 
{
	Collection<Object> c1=new ArrayList<>();
	c1.add("Bhavitha");
	c1.add(new String("ASBJ"));
	c1.add(new StringBuffer("Java"));
	c1.add(new Employee());
	
	System.out.println(c1.size());
	System.out.println(c1.isEmpty());
	System.out.println(c1.contains("ASBJ"));
		
	for(Object o1:c1)
	{
		System.out.println(o1);
	}
	System.out.println("------------------------------------------");
	Iterator<Object> itr=c1.iterator();
	while(itr.hasNext()) {
		Object o1=itr.next();
		System.out.println(o1);
	}
	
	
}
}
