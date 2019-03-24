
import java.util.Scanner;


public class AppUI {
    Scanner reader ;
    Airport airport;
    String airportPanelHeader;
    String airportPanelMenu;
    String flightServiceHeader;
    String flightServesMenu;

    public AppUI() {
        this.reader = new Scanner(System.in);
        this.airport = new Airport();
        this.airportPanelHeader = "Airport panel\n" +
                                   "--------------------\n";
        this.airportPanelMenu = "Choose operation:\n" +
                                "[1] Add airplane\n" +
                                "[2] Add flight\n" +
                                "[x] Exit";
        this.flightServiceHeader = "\nFlight service\n" +
                                   "------------\n";
        this.flightServesMenu = "Choose operation:\n" +
                                "[1] Print planes\n" +
                                "[2] Print flights\n" +
                                "[3] Print plane info\n" +
                                "[x] Quit";
    }

    public void start() {
        airportUILoop();
        flightserviceIULoop();
    }

    private void airportUILoop() {
        String choice;
        System.out.println(airportPanelHeader);
        while (true) {
            System.out.println(airportPanelMenu);
            choice = getChoice();
            if (choice.equals("X") || choice.equals("x")) {
                System.out.println();
                break;
            } else if (choice.equals("1")) {
                addAirplane();
            } else if (choice.equals("2")) {
                addFlight();
            }
        }
    }

    private void addAirplane() {
        System.out.print("Give plane ID: ");
        String airplaneID = reader.nextLine();
        System.out.print("Give plane capacity: ");
        int airplaneCapicity = Integer.parseInt(reader.nextLine());
        airport.addPlane(airplaneID, airplaneCapicity);
    }

    private void addFlight() {
        System.out.print("Give plane ID: ");
        String airplaneID = reader.nextLine();
        System.out.print("Give departure airport code: ");
        String departureCode = reader.nextLine();
        System.out.print("Give destination airport code: ");
        String destinationCode = reader.nextLine();
        Airplane plane = airport.getPlane(airplaneID);
        if (plane != null)
            airport.addFlight(plane, departureCode, destinationCode);
        else
            System.out.println("That plane doesn't exist.");
    }

    private void flightserviceIULoop() {
        String choice;
        System.out.println(flightServiceHeader);
        while (true) {
            System.out.println(flightServesMenu);
            choice = getChoice();
            if (choice.equals("X") || choice.equals("x")) {
                System.out.println();
                break;
            } else if (choice.equals("1")) {
                airport.printAirplanes();
            } else if (choice.equals("2")) {
                airport.printFlights();
            } else if (choice.equals("3")) {
                printPlaneInfo();
            }
        }
    }

    private void printPlaneInfo() {
        System.out.print("Give plane ID: ");
        String airplaneID = reader.nextLine();
        Airplane plane = airport.getPlane(airplaneID);
        if (plane != null) {
            System.out.println(plane);
        } else {
            System.out.println("That plane doesn't exist.");
        }
    }

    private String getChoice() {
        System.out.print("> ");
        return reader.nextLine();
    }

}
