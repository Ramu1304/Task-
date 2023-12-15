package task2;

import java.util.Scanner;

public class HotelTariff {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the month, room rent per day, and number of days stayed
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the room rent per day: ");
        double roomRentPerDay = scanner.nextDouble();

        System.out.print("Enter the number of days stayed: ");
        int numberOfDays = scanner.nextInt();

        // Calculate the hotel tariff
        double hotelTariff = calculateHotelTariff(month, roomRentPerDay, numberOfDays);

        // Output the hotel tariff with 2 decimal places
        System.out.printf("Hotel Tariff: %.2f\n", hotelTariff);

        scanner.close();
    }

    // Function to calculate the hotel tariff based on the month
    private static double calculateHotelTariff(int month, double roomRentPerDay, int numberOfDays) 
    {
        double hotelTariff;

        switch (month) {
            case 4: 
            case 5:
            case 6:
            case 11:
            case 12:
                // Room rent is 20% higher during peak seasons
                hotelTariff = roomRentPerDay * numberOfDays * 1.2;
                break;
            default:
                hotelTariff = roomRentPerDay * numberOfDays;
        }

        return hotelTariff;
    }

}
