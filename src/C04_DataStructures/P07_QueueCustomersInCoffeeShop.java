package C04_DataStructures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P07_QueueCustomersInCoffeeShop {
    public static void main(String[] args) {

        Queue<String> customerQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Coffee Shop Menu ---");
            System.out.println("1. Add Customer to Line");
            System.out.println("2. Serve Next Customer");
            System.out.println("3. View Current Line");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1: // Add customer
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    customerQueue.add(name);
                    System.out.println(name + " added to the line.");
                    break;

                case 2: // Serve customer
                    if (customerQueue.isEmpty()) {
                        System.out.println("No customers to serve.");
                    } else {
                        String servedCustomer = customerQueue.poll();
                        System.out.println("Serving " + servedCustomer);
                    }
                    break;

                case 3: // View line
                    if (customerQueue.isEmpty()) {
                        System.out.println("The line is currently empty.");
                    } else {
                        System.out.println("Current line: " + customerQueue);
                    }
                    break;

                case 4: // Exit
                    System.out.println("Closing Coffee Shop Queue. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select from 1 to 4.");
            }

        } while (choice != 4);

        scanner.close();

    }
}
