package C04_DataStructures;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class P07_LinkedListContactList {
    public static void main(String[] args) {

        LinkedList<String> contactList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Contact List Menu ---");
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Remove Contact");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Add contact
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phone = scanner.nextLine();
                    contactList.add(name + " --> " + phone);
                    System.out.println("Contact added.");
                    break;

                case 2: // View contacts
                    if (contactList.isEmpty()) {
                        System.out.println("Contact list is empty.");
                    } else {
                        System.out.println("\n--- Contact List ---");
                        for (String contact : contactList) {
                            System.out.println(contact);
                        }
                    }
                    break;

                case 3: // Remove contact
                    System.out.print("Enter name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    boolean removed = false;

                    Iterator<String> iterator = contactList.iterator();
                    while (iterator.hasNext()) {
                        String contact = iterator.next();
                        if (contact.toLowerCase().startsWith(nameToRemove.toLowerCase() + " -->")) {
                            iterator.remove();
                            System.out.println("Contact removed.");
                            removed = true;
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4: // Exit
                    System.out.println("Exiting Contact List Manager.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1-4.");
            }

        } while (choice != 4);

        scanner.close();
    }

}
