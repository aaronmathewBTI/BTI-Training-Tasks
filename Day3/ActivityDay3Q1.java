package Day3;

import java.util.Scanner;

class Booking {
    private String PassengerName;
    private double baseFare;

    public Booking(String passengerName, double baseFare) {
        PassengerName = passengerName;
        this.baseFare = baseFare;
    }

    public String getPassengerName() {
        return PassengerName;
    }

    public void setPassengerName(String passengerName) {
        PassengerName = passengerName;
    }

    public double getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(double baseFare) {
        this.baseFare = baseFare;
    }

    public double calculateFare() {
        return getBaseFare();
    }

    public void displayBookingDetails() {
        System.out.println("Passenger name " + PassengerName + ", " + "Fare " + calculateFare());
    }
}

class FlightBooking extends Booking {
    public FlightBooking(String passengerName, double baseFare) {
        super(passengerName, baseFare);
    }

    @Override
    public double calculateFare() {
        double gst = getBaseFare() * 0.18;
        double luxuryCharge = (getBaseFare() > 5000 ? getBaseFare() * 0.05 : 0.0);
        double totalFare = getBaseFare() + gst + luxuryCharge;
        return totalFare;
    }
}

class TrainBooking extends Booking {
    public TrainBooking(String passengerName, double baseFare) {
        super(passengerName, baseFare);
    }

    @Override
    public double calculateFare() {
        double reservationCharge = 250;
        double totalFare = getBaseFare() + reservationCharge;
        if (getBaseFare() < 100) {
            totalFare = totalFare - (getBaseFare() * 0.10);
        }
        return totalFare;
    }
}

public class ActivityDay3Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Passenger name: ");
        String PassengerName = scan.nextLine();
        System.out.println("Enter Base Fare: ");
        double baseFare = scan.nextDouble();
        System.out.println("Choice of booking: 1 for Flight and 2 for Train");
        int choice = scan.nextInt();

        Booking booking;

        if (choice == 1) {
            booking = new FlightBooking(PassengerName, baseFare);

            booking.displayBookingDetails();
        } else if (choice == 2) {
            booking = new TrainBooking(PassengerName, baseFare);

            booking.displayBookingDetails();
        }

        // booking.displayBookingDetails();
    }

}
