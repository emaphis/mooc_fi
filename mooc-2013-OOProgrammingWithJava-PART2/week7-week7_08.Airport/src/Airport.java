
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Airport {
    private final Map<String, Airplane> airplanes;
    private final List<Flight> flights;

    public Airport() {
       this.airplanes = new HashMap<String, Airplane>();
       this.flights = new ArrayList<Flight>();
    }

    public void addPlane(String airplaneID, int airplaneCapacity) {
        Airplane plane = new Airplane(airplaneID, airplaneCapacity);
        airplanes.put(airplaneID, plane);
    }

    public Airplane getPlane(String airplaneID) {
        if (airplanes.containsKey(airplaneID))
            return airplanes.get(airplaneID);
    
        return null;
    }

    public void addFlight(Airplane plane, String departureCode, String destinationCode) {
        Flight flight = new Flight(plane, departureCode, destinationCode);
        flights.add(flight);
    }

    public void printAirplanes() {
        for (Airplane plane : airplanes.values()) {
            System.out.println(plane);
        }
    }

    public void printFlights() {
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }
}
