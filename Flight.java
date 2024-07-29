import java.util.ArrayList;
import java.util.Date;

public class Flight {
    private String flight_no;
    private String flight_name;
    private String departure_airports;
    private String arrival_airports;
    private Date departDateTime;
    private Date arriveDateTime;
    private ArrayList<Seat> seats;
    private double duration;
    private double price;
    private String aircraftType;

    protected Flight(){
        this("AirportA", "AirportB", new Date(2024,1,1), new Date(2024,1,1));
    }

    protected  Flight(String departure_airports, String arrival_airports, Date departDateTime, Date arriveDateTime){
        this.departure_airports = departure_airports;
        this.arrival_airports = arrival_airports;
        this.seats = new ArrayList<>();
    }

    public ArrayList<Seat> findAvailableSeats(){
        ArrayList<Seat> availableSeats = new ArrayList<>();
        for (Seat seat : seats){
            if (seat.isAvailable() == true){
                availableSeats.add(seat);
            }
        }
        if (availableSeats != null){
            return availableSeats;
        } else {
            System.out.println("There is no available seats.");
            return null;
        }
    }

    @Override
    public String toString() {
        return "Flight:" +
                "Departure Airports = " + departure_airports +
                "\nArrival Airports = " + arrival_airports +
                "\nDepart Date & Time = " + departDateTime +
                "\nArrive Date & Time = " + arriveDateTime +
                "\nSeats = " + seats +
                "\nFlight No. = " + flight_no +
                "\nFlight Name = " + flight_name +
                "\nDuration = " + duration +
                "\nPrice = " + price +
                "\nAircraft Type = " + aircraftType +
                '\n';
    }

    public String getFlight_name() {
        return flight_name;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public Date getArriveDateTime() {
        return arriveDateTime;
    }

    public Date getDepartDateTime() {
        return departDateTime;
    }

    public String getArrival_airports() {
        return arrival_airports;
    }

    public String getDeparture_airports() {
        return departure_airports;
    }

    public void setFlight_name(String flight_name) {
        this.flight_name = flight_name;
    }

    public void setArrival_airports(String arrival_airports) {
        this.arrival_airports = arrival_airports;
    }

    public void setArriveDateTime(Date arriveDateTime) {
        this.arriveDateTime = arriveDateTime;
    }

    public void setDepartDateTime(Date departDateTime) {
        this.departDateTime = departDateTime;
    }

    public void setDeparture_airports(String departure_airports) {
        this.departure_airports = departure_airports;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }
}
