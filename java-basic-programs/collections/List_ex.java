package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class List_ex {
public static void main(String[] args) {

		List<Integer> l1=new ArrayList<>();
		List<Integer> l2=new Vector<>();
		List<Integer> l3=new LinkedList<>(Arrays.asList(10,20,30,40,50,60,70,80,90,100,17));
		
		//index based Operations
		//preference will be given to Index
		
		System.out.println(l3);
		
		l3.remove(5);
		l3.set(3, 45);//replace
		l3.add(1,25);
		
		for(int i=0;i<l3.size();i++) {
			System.out.println(i+"--> "+l3.get(i));
		}
		System.out.println(l3.subList(1, 4));
		System.out.println(l3.indexOf(100));
		System.out.println(l3.lastIndexOf(17));
		
		//ListIterator itr=l3.listIterator();
		ListIterator itr1=l3.listIterator();
		
		while(itr1.hasNext()) {
			itr1.next();
		}
		while(itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}
		
		
	}
}

