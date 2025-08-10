package C04_DataStructures;

import java.util.Scanner;
import java.util.Stack;

public class P09_BookStackSearch {
    public static void main(String[] args) {

        Stack<String> bookStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        // Step 1: Add 5 books
        System.out.println("Add 5 books to the stack:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter title of book " + i + ": ");
            String title = scanner.nextLine();
            bookStack.push(title);
        }

        // Step 2: Search for a specific book
        System.out.print("\nEnter the title of the book to retrieve: ");
        String searchTitle = scanner.nextLine();

        Stack<String> tempStack = new Stack<>();
        boolean found = false;

        while (!bookStack.isEmpty()) {
            String topBook = bookStack.pop();
            if (topBook.equalsIgnoreCase(searchTitle)) {
                System.out.println("\n✅ Book found and retrieved: \"" + topBook + "\"");
                found = true;
                break;
            } else {
                tempStack.push(topBook);
            }
        }

        // Step 3: Put remaining books back into original stack
        while (!tempStack.isEmpty()) {
            bookStack.push(tempStack.pop());
        }

        if (!found) {
            System.out.println("\n❌ Book not found in the stack.");
        }

        // Step 4: Print remaining books
        System.out.println("\n📚 Remaining books in the stack (top to bottom):");
        if (bookStack.isEmpty()) {
            System.out.println("The stack is now empty.");
        } else {
            for (int i = bookStack.size() - 1; i >= 0; i--) {
                System.out.println(bookStack.get(i));
            }
        }

        scanner.close();

    }
}
