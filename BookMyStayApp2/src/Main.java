public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("Book My Stay App");
        System.out.println("Version 2.0");

        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        Room single = new SingleRoom(1,200,1000);
        Room doubleRoom = new DoubleRoom(2,350,1800);
        Room suite = new SuiteRoom(3,500,3000);

        single.displayRoomDetails();
        System.out.println("Available: " + singleAvailable);

        doubleRoom.displayRoomDetails();
        System.out.println("Available: " + doubleAvailable);

        suite.displayRoomDetails();
        System.out.println("Available: " + suiteAvailable);
    }
}