package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Max_Min {
public static void main(String[] args) {
	List<Integer> ls=new ArrayList<>(Arrays.asList(10,45,6,7,3,8,54));
	int fmax=0;
	int smax=0;
	for(int i=0;i<ls.size();i++) {
		if(ls.get(i)>fmax) {
			smax=fmax;
			fmax=ls.get(i);
		}
		else if(ls.get(i)>smax && smax!=ls.get(i)) {
			smax=ls.get(i);		}
	}
	System.out.println("First maximum --> "+fmax);
	System.out.println("Second maximum --> "+smax);
	
	System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
	int fmin=fmax;
	int smin=fmax;
	for(int i=0;i<ls.size();i++) {
		if(ls.get(i)<fmin) {
			smin=fmin;
			fmin=ls.get(i);
		}
		else if(ls.get(i)<smin && smax!=ls.get(i)) {
			smin=ls.get(i);		}
	}
	System.out.println("First minimum --> "+fmax);
	System.out.println("Second minimum --> "+smax);
	
	
}
}
/*
 * for(int x:ls) {
		if(x>fmax) {
			smax=fmax;
			fmax=x;
		}
		else if(x>smax) {
			smax=x;
		}
	}
	System.out.println("First maximum --> "+fmax);
	System.out.println("Second maximum --> "+smax);
	System.out.println("----------------------------------------------");
	 
	int fmin=fmax;
	int smin=smax;
	for(int x:ls) {
		if(x<fmin) {
			smin=fmin;
			fmin=x;
		}
		else if(x<smin) {
			smin=x;
		}
	}
	System.out.println("First minimum --> "+fmin);
	System.out.println("Second minimum --> "+smin);
 * */
