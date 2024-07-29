public class Seat {

    private String seat_no;
    private String seat_class;
    private Flight flight;
    private boolean availability;
    private String seat_position;
    private boolean hasExtraLegroom;
    private boolean hasPowerOutlet;
    private boolean hasInflightEntertainment;
    private boolean isReclining;

    protected Seat(){
        this("A00", "Economy", new Flight());
    }

    protected Seat(String seat_no, String seat_class, Flight flight){
        this.seat_no = seat_no;
        this.seat_class = seat_class;
        this.flight = new Flight();
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public boolean isAvailable(){
        return availability;
    }

    @Override
    public String toString() {
        return "Seat:" +
                "Seat No. = " + seat_no +
                "\nSeat Class = " + seat_class +
                "\nFlight = " + flight.getDeparture_airports() +
                '\n';
    }

    public String getSeat_class() {
        return seat_class;
    }

    public String getSeat_no() {
        return seat_no;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setSeat_no(String seat_no) {
        this.seat_no = seat_no;
    }

    public void setSeat_class(String seat_class) {
        this.seat_class = seat_class;
    }
}
