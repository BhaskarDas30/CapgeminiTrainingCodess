package FlightManagementSystem;

import java.util.*;

public class FlightsScheduleManager {
	List<Flight> flights=new ArrayList<>();
	public void addFlights(Flight flight) {
		flights.add(flight);
	}
	public boolean bookFlight(int id, int count) {
		for(Flight f : flights) {
			if(id==f.getFlightId()) {
				if(f.isAvailable() && f.getAvailableSeats()>=count) {
					f.bookSeats(count);
					return true;
				}
			}
		}
		return false;
	}
	public void getAvailableFlight(String start, String end) {
		boolean available=false;
		for(Flight f : flights) {
			if(f.getArrivalTime().equals(start) && f.getDepartureTime().equals(end)) {
				available=true;
				f.getFlightInfo();
			}
		}
		if(available==false) {
			System.out.println("No Flights Available");
		}
	}
}
