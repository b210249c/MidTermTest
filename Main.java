import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Senai International Airport", "Kuala Lumpur International Airport", new Date(2024,8,1), new Date(2024, 8, 1));

        Seat seat1 = new Seat("A001", "Economy", flight1);
        Seat seat2 = new Seat("A002", "Business", flight1);

        Passenger passenger1 = new Passenger();

        passenger1.createReservation(flight1, seat1);

        System.out.println(flight1);
        System.out.println(passenger1);

    }
}