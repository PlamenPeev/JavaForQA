package C04_DataStructures;

import java.util.Scanner;
import java.util.Stack;

public class P08_StackOfBooks {
    public static void main(String[] args) {

        Stack<String> bookStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Book Stack Menu ---");
            System.out.println("1. Add Book to Stack");
            System.out.println("2. View Top Book");
            System.out.println("3. Remove Top Book");
            System.out.println("4. View all books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1: // Add book
                    System.out.print("Enter book title: ");
                    String bookTitle = scanner.nextLine();
                    bookStack.push(bookTitle);
                    System.out.println("\"" + bookTitle + "\" added to the stack.");
                    break;

                case 2: // View top book
                    if (bookStack.isEmpty()) {
                        System.out.println("The book stack is empty.");
                    } else {
                        System.out.println("Top book: \"" + bookStack.peek() + "\"");
                    }
                    break;

                case 3: // Remove top book
                    if (bookStack.isEmpty()) {
                        System.out.println("No books to remove.");
                    } else {
                        String removedBook = bookStack.pop();
                        System.out.println("\"" + removedBook + "\" has been removed from the stack.");
                    }
                    break;


                case 4: // View all books
                    if (bookStack.isEmpty()) {
                        System.out.println("The book stack is empty.");
                    } else {
                        System.out.println("All books: " + bookStack);
                    }
                    break;


                case 5: // Exit
                    System.out.println("Exiting Book Stack Manager.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
            }

        } while (choice != 5);

        scanner.close();

    }
}
