
// UC2: Basic Room Types & Static Availability

abstract class Room {
    protected int beds;
    protected int size;
    protected double price;

    public Room(int beds, int size, double price) {
        this.beds = beds;
        this.size = size;
        this.price = price;
    }

    abstract void displayRoomDetails();
}

// Single Room
class SingleRoom extends Room {

    public SingleRoom(int beds, int size, double price) {
        super(beds, size, price);
    }

    void displayRoomDetails() {
        System.out.println("Room Type: Single Room");
        System.out.println("Beds: " + beds);
        System.out.println("Size: " + size + " sq.ft");
        System.out.println("Price: " + price);
        System.out.println();
    }
}

// Double Room
class DoubleRoom extends Room {

    public DoubleRoom(int beds, int size, double price) {
        super(beds, size, price);
    }

    void displayRoomDetails() {
        System.out.println("Room Type: Double Room");
        System.out.println("Beds: " + beds);
        System.out.println("Size: " + size + " sq.ft");
        System.out.println("Price: " + price);
        System.out.println();
    }
}

// Suite Room
class SuiteRoom extends Room {

    public SuiteRoom(int beds, int size, double price) {
        super(beds, size, price);
    }

    void displayRoomDetails() {
        System.out.println("Room Type: Suite Room");
        System.out.println("Beds: " + beds);
        System.out.println("Size: " + size + " sq.ft");
        System.out.println("Price: " + price);
        System.out.println();
    }
}

// Main Class
public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("        Book My Stay App         ");
        System.out.println("            Version 2.0          ");
        System.out.println("=================================");

        int singleRoomAvailable = 5;
        int doubleRoomAvailable = 3;
        int suiteRoomAvailable = 2;

        Room single = new SingleRoom(1, 200, 1000);
        Room doubleRoom = new DoubleRoom(2, 350, 1800);
        Room suite = new SuiteRoom(3, 500, 3000);

        System.out.println("\nRoom Details:\n");

        single.displayRoomDetails();
        System.out.println("Available: " + singleRoomAvailable);

        doubleRoom.displayRoomDetails();
        System.out.println("Available: " + doubleRoomAvailable);

        suite.displayRoomDetails();
        System.out.println("Available: " + suiteRoomAvailable);

        System.out.println("\nApplication Terminated.");
    }
}