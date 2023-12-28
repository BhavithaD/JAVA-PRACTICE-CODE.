package method_overloading;

public class RailWayTicketReservation
{
    static void pasenger(String name)
	{
		  System.out.println("Passenger Name-- "+name);
	}
	static void pasenger(String Depart, String Going)
	{
		  System.out.println("Train Departing From-- "+Depart);
		  System.out.println("Train Going To-- "+Going);
	}
	static void pasenger(double time1,double time2)
	{
		System.out.println("Train Starting time from Chrompet= "+time1);
		System.out.println("Train Reaching time to ChennaiPark = "+time2);
	}
	static void pasenger(int fare,String r)
	{
		System.out.print("Ticket cost from Chrompet to ChennaiPark Station is "+fare);
		System.out.println(" "+r);
	}
	 public static void main(String[] args) 
	{
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		pasenger("Bhavitha");
		pasenger("Chromepet","ChennaiPark");
		pasenger(12.25,13.15);
		pasenger(10,"rupees");
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		
	}
}
