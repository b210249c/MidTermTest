import java.util.Random;

public class Passenger {
    private  Reservation reservation;
    private Flight flight;
    private Seat seat;
    private String name;
    private String email;
    private String phone_no;
    private String gender;
    private String address;


    protected Passenger(){
        this(new Flight(), new Seat());
    }
    protected Passenger(Flight flight, Seat seat){
        this.flight = flight;
        this.seat = seat;
    }



    public Reservation createReservation(Flight flight, Seat seat){
        if (seat.isAvailable()){
            seat.setAvailability(false);
            String reservationID = generateRandomString(6);
            reservation = new Reservation(reservationID, flight, seat);
            return reservation;
        } else {
            System.out.println("Seat is not available.");
            return null;
        }
    }

    private String generateRandomString(int length){
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = (int)(AlphaNumericString.length() * Math.random());

            sb.append(AlphaNumericString.charAt(index));
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return "Passenger:" +
                "Reservation = " + reservation +
                "\nFlight = " + flight.getDeparture_airports() +
                "\nSeat = " + seat.getSeat_no() +
                "\nName = " + name + '\'' +
                "\nEmail = " + email + '\'' +
                "\nPhone_no = " + phone_no + '\'' +
                "\nGender = " + gender + '\'' +
                "\nAddress = " + address + '\'' +
                '\n';
    }
}
