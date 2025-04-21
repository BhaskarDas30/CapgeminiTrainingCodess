package FlightManagementSystem;

public class InternationalFlight extends Flight {
	private int countryCode;

	public InternationalFlight(int flightId, int availableSeats, String arrivalTime, String departureTime,
			int countryCode) {
		super(flightId, availableSeats, arrivalTime, departureTime);
		this.countryCode=countryCode;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	@Override
	public void bookSeats(int n) {
		if(n<=getAvailableSeats()) {
			System.out.println("Seats are Booked");
			setAvailableSeats(getAvailableSeats()-n);
		} else {
			System.out.println("Seats Cannot be Booked");
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
		System.out.println("Flight ID : "+getFlightId());
		System.out.println("State Code : "+getCountryCode());
		System.out.println("Departure Time : "+getDepartureTime());
		System.out.println("Arrival Time : "+getArrivalTime());
		System.out.println("Available Seats : "+getAvailableSeats());
	}	
}
