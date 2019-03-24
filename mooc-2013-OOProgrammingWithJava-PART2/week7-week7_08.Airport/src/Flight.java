
public class Flight {
    private final Airplane plane;
    private final String departureCode;
    private final String destinationCode;

    // assume Airplane exits
    public Flight(Airplane plane, String departureCode, String destinationCode) {
        this.plane = plane;
        this.departureCode = departureCode;
        this.destinationCode = destinationCode;
    }

    public Airplane getAirplane() {
        return plane;
    }

    public String getAirplaneID() {
        return plane.getAirplaneID();
    }

    public String getDepartureCode() {
        return departureCode;
    }

    public String getDestinationCode() {
        return destinationCode;
    }

    @Override
    public String toString() {
        return plane.toString() +  " (" + departureCode + "-" + destinationCode + ")";
    }

    
    


}
