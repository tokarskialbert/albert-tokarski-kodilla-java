import com.kodilla.exception.test.*;

public class ExceptionModuleRunner {

    public static void main(String[] args) {

        Flight flight = new Flight("Moskwa", "Krakow");
        FlightFinder flightFinder = new FlightFinder();

        try {
           if(flightFinder.findArrivalAirport(flight) && flightFinder.findDepartureAirport(flight)) {
               System.out.println("I find something");
           } else {
               System.out.println("Nothing... just nothing");
           }

        } catch (RouteNotFoundException ex) {
            System.out.println("Error! " + ex.getMessage());
        }
    }
}
