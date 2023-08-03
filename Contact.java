package mypackage;

public class Contact {
    private String name;
    private String address;
    private String phoneNumber;

    // Constructor
    public Contact(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Override toString() method to display the contact details
    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address + ", Phone Number: " + phoneNumber;
    }
}
