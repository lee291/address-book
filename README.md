# Address Book App

The address book app allows users to manage contacts with names, addresses, and phone numbers through a command-line interface (CLI).

## Features

- Add Contacts: Users can add new contacts to the address book by providing their name, address, and phone number.

- View Contacts: Users can view all the contacts stored in the address book.

- Delete Contacts: Users can delete a contact from the address book.

### Prerequisites

- Java Development Kit (JDK) installed on your machine.
- A Java IDE (e.g., Eclipse, IntelliJ) or any text editor.

### Running the Application

1. Open the project in your Java IDE or text editor.

2. Navigate to the `AddressBookApp.java` file.

3. Run the `AddressBookApp` class to start the application.

## Usage

Upon running the application, you will be presented with a menu displaying the available options. Follow the on-screen prompts to interact with the address book:

1. Enter `1` to add a new contact. Provide the name, address, and phone number as requested.

2. Enter `2` to view all contacts in the address book.

3. Enter `3` to delete a contact. Provide the name of the contact to delete.

4. Enter `4` to exit the application.

## Code Structure

The project directory has the following structure:

```
address-book
├── Contact.java
├── AddressBook.java
└── AddressBookApp.java
```

- `Contact.java`: A class representing a contact with attributes and methods.
- `AddressBook.java`: A class managing the address book, including adding, viewing, and deleting contacts.
- `AddressBookApp.java`: The main application class containing the CLI and user interaction logic.

## License

This project is licensed under the [MIT License](LICENSE).
