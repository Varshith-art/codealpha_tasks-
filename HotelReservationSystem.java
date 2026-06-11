import java.util.Scanner;

public class HotelReservationSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int standardRooms = 5;
        int deluxeRooms = 3;
        int suiteRooms = 2;

        int choice;

        do {

            System.out.println("\n================================");
            System.out.println("     HOTEL RESERVATION SYSTEM");
            System.out.println("================================");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("\nAvailable Rooms");
                    System.out.println("Standard Rooms: " + standardRooms);
                    System.out.println("Deluxe Rooms: " + deluxeRooms);
                    System.out.println("Suite Rooms: " + suiteRooms);

                    break;

                case 2:

                    System.out.println("\nSelect Room Type");
                    System.out.println("1. Standard (₹1000)");
                    System.out.println("2. Deluxe (₹2000)");
                    System.out.println("3. Suite (₹3000)");

                    int roomType = scanner.nextInt();

                    if (roomType == 1 && standardRooms > 0) {

                        standardRooms--;

                        System.out.println("Payment Successful: ₹1000");
                        System.out.println("Standard Room Booked.");

                    } else if (roomType == 2 && deluxeRooms > 0) {

                        deluxeRooms--;

                        System.out.println("Payment Successful: ₹2000");
                        System.out.println("Deluxe Room Booked.");

                    } else if (roomType == 3 && suiteRooms > 0) {

                        suiteRooms--;

                        System.out.println("Payment Successful: ₹3000");
                        System.out.println("Suite Room Booked.");

                    } else {

                        System.out.println("Room Not Available.");
                    }

                    break;

                case 3:

                    System.out.println("\nSelect Room Type To Cancel");
                    System.out.println("1. Standard");
                    System.out.println("2. Deluxe");
                    System.out.println("3. Suite");

                    int cancelType = scanner.nextInt();

                    if (cancelType == 1) {

                        standardRooms++;
                        System.out.println("Standard Room Reservation Cancelled.");

                    } else if (cancelType == 2) {

                        deluxeRooms++;
                        System.out.println("Deluxe Room Reservation Cancelled.");

                    } else if (cancelType == 3) {

                        suiteRooms++;
                        System.out.println("Suite Room Reservation Cancelled.");

                    } else {

                        System.out.println("Invalid Option.");
                    }

                    break;

                case 4:

                    System.out.println("Thank You For Using Hotel Reservation System.");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);

        scanner.close();
    }
}