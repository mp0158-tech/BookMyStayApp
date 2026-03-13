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