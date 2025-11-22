import java.util.Scanner;

public class RickshawFare {
    public static void main(String[] args) {
        // 1. Declare constants for fare calculation
        double BASE_FARE = 25.0;       // base fare
        double PER_KM = 15.0;          // per kilometer charge
        double PER_MIN = 2.0;          // per minute charge
        double LOCAL_DISCOUNT = 0.10;  // 10% discount for locals (long distance)
        double NIGHT_SURCHARGE = 0.20; // 20% surcharge for night travel

        // 2. Use Scanner to get inputs
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance (in km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter time (in minutes): ");
        double time = sc.nextDouble();

        System.out.print("Is the customer local? (true/false): ");
        boolean isLocal = sc.nextBoolean();

        System.out.print("Is the travel during night? (true/false): ");
        boolean isNight = sc.nextBoolean();

        // 3. Calculate fare
        double fare = BASE_FARE + (distance * PER_KM) + (time * PER_MIN);

        // 4. Apply discount if applicable (locals on long distance, say ≥ 10 km)
        fare = (isLocal && distance >= 10) ? fare - (fare * LOCAL_DISCOUNT) : fare;

        // 5. Apply night surcharge if applicable
        fare = isNight ? fare + (fare * NIGHT_SURCHARGE) : fare;

        // 6. Display the final fare in Nepali format
        System.out.println("Final Rickshaw Fare");
        System.out.println("-------------------");
        System.out.println("Rs. " + fare);

        sc.close();
    }
}