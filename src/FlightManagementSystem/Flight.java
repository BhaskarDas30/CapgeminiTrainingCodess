package FlightManagementSystem;

abstract public class Flight {
	private int flightId;
	private int availableSeats;
	private String arrivalTime;
	private String departureTime;
	
	public Flight(int flightId, int availableSeats, String arrivalTime, String departureTime) {
		this.flightId=flightId;
		this.availableSeats=availableSeats;
		this.arrivalTime=arrivalTime;
		this.departureTime=departureTime;
	}
	
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	abstract public void bookSeats(int n);
	abstract public boolean isAvailable();
	abstract public void getFlightInfo();
	
}
