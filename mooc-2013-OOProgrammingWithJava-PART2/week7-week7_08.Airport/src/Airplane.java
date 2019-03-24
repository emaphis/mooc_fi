
public class Airplane {
    private String airplaneID;
    private int airplaneCapacity;

    public Airplane(String airplaneID, int airplaneCapacity) {
        this.airplaneID = airplaneID;
        this.airplaneCapacity = airplaneCapacity;
    }

    public String getAirplaneID() {
        return airplaneID;
    }

    public int getAirplaneCapacity() {
        return airplaneCapacity;
    }

    @Override
    public String toString() {
        return airplaneID + " (" + airplaneCapacity + " ppl)";
    }

}
