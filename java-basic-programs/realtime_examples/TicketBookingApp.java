package realtime_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class TicketBookingApp {
	static int Charge=0;
public static void main(String[] args) {
	List<String> l1=new ArrayList<String>();
	l1.add("Tambaram");  l1.add("Tambaram Sanatorium"); l1.add("Chrompet");      l1.add("Pallavaram");
	l1.add("Tirusulam"); l1.add("Minambakkam");	        l1.add("Palavanthangal");l1.add("St Thomas Mount");	
	l1.add("Guindy");    l1.add("Saiadapet");	        l1.add("Mambalam");	      l1.add("Kodambakkam");
	l1.add("Numgambakkam");	l1.add("Chetpet");	        l1.add("Chennai Egmore");
	l1.add("Chennai Park");	l1.add("Chennai Fort");  	l1.add("Chennai Beach");
	
	
	System.out.println("********************************************");
	System.out.println("------------SOUTHERN RAILWAYS------------");
	System.out.println();
	System.out.println("Train Route >> Starts from TAMBARAM End to CHHENAI BEACH");
	System.out.println();
	System.out.println("Number of Stops Between (Tambaram to Chennai Beach)--> "+l1.size());
	
	Scanner sc=new Scanner(System.in);
	System.out.println();
	System.out.println("1.Display Stations");
	System.out.println("2.Select Stations ");
	System.out.println();
	System.out.println("Enter Your Option--> ");
	int Choice=sc.nextInt();
	
	switch(Choice) {
	case 1:
		 System.out.println("--------------------------------");
		 ListIterator<String> lt=l1.listIterator();
		 while(lt.hasNext())
		 {
			System.out.println(lt.next()); 
		 }
		 System.out.println("--------------------------------");
		 break;
	case 2:
		System.out.println("Enter Arrival Destination --> ");
		String s1=sc.nextLine();
		System.out.println("Enter Departure Destination --> ");
		String s2=sc.nextLine();
		
		if(l1.contains(s1)) {
			 if(l1.contains(s2)) {
				 if(s1.contains(s2)) 
				 {
					 System.out.println("Travel Cost--> "+Charge);
				 }
				 else 
				 {
					 System.out.println("Travel Cost--> "+10);
				 }
			 }
		}
		else {
			System.out.println("Not Included");
		}
		break;
		
		default:
			System.out.println("Invalid Selection");
	}
	
	
	sc.close();
	System.out.println("********************************************");
	
}
}
