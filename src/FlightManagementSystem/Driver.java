package FlightManagementSystem;

import java.util.*;

public class Driver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FlightsScheduleManager manager=new FlightsScheduleManager();
		while(true) {
			System.out.println("Enter 1 to Add Flight");
			System.out.println("Enter 2 to Book Flight");
			System.out.println("Enter 3 to Get Available Flight");
			System.out.println("Enter 4 to Add Flight");
			System.out.println("Enter Your Choice :- ");
			int ch=sc.nextInt();
			Flight f=null;
			switch(ch) {
			case 1:{
				System.out.println("Enter 1 for Domestic");
				System.out.println("Enter 2 for International");
				int c=sc.nextInt();
				switch(c) {
				case 1:{
					System.out.println("Enter Details");
					f=new DomesticFlight(sc.nextInt(), sc.nextInt(), sc.next(), sc.next(), sc.nextInt());
					manager.addFlights(f);
					break;
				} 
				case 2:{
					System.out.println("Enter Details");
					f=new InternationalFlight(sc.nextInt(), sc.nextInt(), sc.next(), sc.next(), sc.nextInt());
					manager.addFlights(f);
					break;
				}
				}
				break;
			}
			case 2:{
				System.out.println("Enter the Flight ID : ");
				int id=sc.nextInt();
				System.out.println("Enter the Number of Seats :");
				int count=sc.nextInt();
				if(manager.bookFlight(id, count)) {
					System.out.println("Flight Booked");
				} else {
					System.out.println("Flight Cannot be Booked");
				}
				break;
			}
			case 3:{
				System.out.println("Enter Arrival Time : ");
				String starttime=sc.next();
				System.out.println("Enter Departure Time : ");
				String departtime=sc.next();
				manager.getAvailableFlight(starttime, departtime);
				break;
			}
			case 4:{
				System.exit(0);
				sc.close();
			}
			}
		}
	}
}
