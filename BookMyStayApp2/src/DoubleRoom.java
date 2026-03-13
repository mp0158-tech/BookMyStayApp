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
