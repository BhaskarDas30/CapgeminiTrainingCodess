package FlightManagementSystem;

public class DomesticFlight extends Flight{
	private int stateCode;

	public DomesticFlight(int flightId, int availableSeats, String arrivalTime, String departureTime, int stateCode) {
		super(flightId, availableSeats, arrivalTime, departureTime);
		this.stateCode=stateCode;
	}
	public int getStateCode() {
		return stateCode;
	}
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	@Override
	public void bookSeats(int n) {
		if(n<=getAvailableSeats()) {
			System.out.println("\nSeats are Booked");
			setAvailableSeats(getAvailableSeats()-n);
		} else {
			System.out.println("\nSeats Cannot be Booked");
		}
	}
	@Override 
	public boolean isAvailable() {
		if(getAvailableSeats()!=0) {
			return true;
		}
		return false;
	}
	@Override
	public void getFlightInfo() {
		System.out.println("\nFlight Details - ");
		System.out.println("\nFlight ID : "+getFlightId());
		System.out.println("State Code : "+getStateCode());
		System.out.println("Departure Time : "+getDepartureTime());
		System.out.println("Arrival Time : "+getArrivalTime());
		System.out.println("Available Seats : "+getAvailableSeats());
	}
}
