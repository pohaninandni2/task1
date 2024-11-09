import java.util.Scanner;

class TravelItineraryPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of destinations: ");
        int numDestinations = scanner.nextInt();
        scanner.nextLine();

        String[] destinations = new String[numDestinations];
        String[] dates = new String[numDestinations];
        double[] budgets = new double[numDestinations];

        for (int i = 0; i < numDestinations; i++) {
            System.out.print("Enter destination " + (i + 1) + ": ");
            destinations[i] = scanner.nextLine();

            System.out.print("Enter date for " + destinations[i] + ": ");
            dates[i] = scanner.nextLine();

            System.out.print("Enter budget for " + destinations[i] + ": ");
            budgets[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        System.out.println("\nYour Travel Itinerary:");
        double totalBudget = 0;
        for (int i = 0; i < numDestinations; i++) {
            System.out.println("Destination: " + destinations[i]);
            System.out.println("Date: " + dates[i]);
            System.out.println("Budget: $" + budgets[i]);
            totalBudget += budgets[i];
            System.out.println();
        }

        System.out.println("Total Budget: $" + totalBudget);
    }
}
