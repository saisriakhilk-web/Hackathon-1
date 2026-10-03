import java.util.Scanner;

public class SolarSystem {

    // Helper method for part 2c
    public static double calculateTotalEnergy(double morning, double evening) {
        return morning + evening;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Part 2a: Display System Details ---
        int panelId = 101;
        double energy = 15.75;
        int numPanels = 12;
        char status = 'A';

        System.out.println("Panel ID: " + panelId);
        System.out.println("Energy: " + energy + " kWh");
        System.out.println("Panels: " + numPanels);
        System.out.println("Status: " + status);

        // --- Part 2b: Check Energy Generation ---
        System.out.print("\nEnter energy generated: ");
        double userEnergy = scanner.nextDouble();

        if (userEnergy >= 10) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }

        // --- Part 2c: Calculate Total Energy ---
        System.out.print("\nEnter morning energy: ");
        double morning = scanner.nextDouble();

        System.out.print("Enter evening energy: ");
        double evening = scanner.nextDouble();

        double total = calculateTotalEnergy(morning, evening);
        System.out.println("Total Energy Generated: " + total + " kWh");

        scanner.close();
    }
}