import com.kodilla.exception.test.*;

public class ExceptionModuleRunner {

    public static void main(String[] args) {

        Flight flight = new Flight("Sarajewo", "Warszawa");
        FlightFinder flightFinder = new FlightFinder();

        try {

            flightFinder.findFlight(flight);

        } catch (RouteNotFoundException ex) {

            System.out.println("Error! " + ex.getMessage());
        }
    }
}
