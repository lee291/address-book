package mypackage;

import java.util.Scanner;

public class AddressBookApp {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Address Book Application");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Delete Contact");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1/2/3/4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();

                    Contact newContact = new Contact(name, address, phoneNumber);
                    addressBook.addContact(newContact);
                    System.out.println("Contact added successfully!");
                    break;

                case 2:
                    System.out.println("\nContacts in Address Book:");
                    addressBook.displayContacts();
                    break;

                case 3:
                    System.out.print("Enter the name of the contact to delete: ");
                    String nameToDelete = scanner.nextLine();
                    Contact contactToDelete = addressBook.findContactByName(nameToDelete);
                    if (contactToDelete != null) {
                        addressBook.deleteContact(contactToDelete);
                        System.out.println("Contact deleted successfully!");
                    } else {
                        System.out.println("Contact not found!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the Address Book Application. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
