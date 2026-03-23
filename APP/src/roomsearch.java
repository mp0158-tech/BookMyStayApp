import java.util.HashMap;

// Inventory Class (UC3 reused)
class RoomInventory {

    private HashMap<String, Integer> rooms;

    public RoomInventory() {
        rooms = new HashMap<>();

        rooms.put("Single Room", 5);
        rooms.put("Double Room", 3);
        rooms.put("Suite Room", 0); // unavailable
    }

    public HashMap<String, Integer> getInventory() {
        return rooms; // read-only access
    }
}

// Room class (for details)
class Room {

    String type;
    int beds;
    int size;
    double price;

    public Room(String type, int beds, int size, double price) {
        this.type = type;
        this.beds = beds;
        this.size = size;
        this.price = price;
    }

    public void display() {
        System.out.println("Room Type: " + type);
        System.out.println("Beds: " + beds);
        System.out.println("Size: " + size + " sq.ft");
        System.out.println("Price: " + price);
    }
}

// Search Service (UC4 logic)
class RoomSearchService {

    public void searchAvailableRooms(RoomInventory inventory) {

        System.out.println("\nAvailable Rooms:\n");

        HashMap<String, Integer> rooms = inventory.getInventory();

        // Room objects
        Room single = new Room("Single Room", 1, 200, 1000);
        Room doubleRoom = new Room("Double Room", 2, 350, 1800);
        Room suite = new Room("Suite Room", 3, 500, 3000);

        if (rooms.get("Single Room") > 0) {
            single.display();
            System.out.println("Available: " + rooms.get("Single Room"));
            System.out.println();
        }

        if (rooms.get("Double Room") > 0) {
            doubleRoom.display();
            System.out.println("Available: " + rooms.get("Double Room"));
            System.out.println();
        }

        if (rooms.get("Suite Room") > 0) {
            suite.display();
            System.out.println("Available: " + rooms.get("Suite Room"));
            System.out.println();
        }
    }
}

// Main Class
public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("        Book My Stay App         ");
        System.out.println("            Version 4.0          ");
        System.out.println("=================================");

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Search service
        RoomSearchService search = new RoomSearchService();

        // Perform search (read-only)
        search.searchAvailableRooms(inventory);

        System.out.println("\nSearch Completed.");
    }
}