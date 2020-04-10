
package FlightControl.domain;

/**
 *
 * @author emaphis
 */
public class Flight {
    private Airplane airplane;
    private Place departureAirport;
    private Place targetAirport;

    public Flight(Airplane airplane, Place departureAirport, Place targetAirport) {
        this.airplane = airplane;
        this.departureAirport = departureAirport;
        this.targetAirport = targetAirport;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public Place getDeparturePlace() {
        return departureAirport;
    }

    public Place getTargetPlace() {
        return targetAirport;
    }

    @Override
    public String toString() {
        return airplane.toString() + " (" + departureAirport + "-" + targetAirport + ")";
    }

}
