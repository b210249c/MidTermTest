import java.util.ArrayList;
import java.util.Date;

public class Reservation {
    private String reservationID;
    private Flight flight;
    private Seat seat;
    private ArrayList<Passenger> passengers;
    private Date reservationDate;
    private String paymentMethod;
    private boolean isCheckedIn;
    private double totalPrice;
    private String reservationStatus;

    protected Reservation(){
        this("ABCDEF", new Flight(), new Seat());
    }

    protected Reservation(String reservationID, Flight flight, Seat seat){
        this.reservationID = reservationID;
        this.flight = flight;
        this.seat = seat;
        this.passengers = new ArrayList<>();
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationID='" + reservationID + '\'' +
                ", flight=" + flight +
                ", seat=" + seat +
                ", passengers=" + passengers +
                ", reservationDate=" + reservationDate +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", isCheckedIn=" + isCheckedIn +
                ", totalPrice=" + totalPrice +
                ", reservationStatus='" + reservationStatus + '\'' +
                '}';
    }
}
