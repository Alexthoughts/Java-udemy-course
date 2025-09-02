package ArrayList.Challenge_Contacts;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("777 166 777");

    public static void main(String[] args) {
        boolean quit = false;
        printActions();
        while (!quit){
            System.out.println("\nEnter action:");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    printActions();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                case 6:
                    System.out.println("quit");
                    quit = true;
                    break;
            }
        }
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.newContact(name, phone);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added`");
        }else {
            System.out.println("Cannot add new contact");
        }
    }

    private static void updateContact(){
        System.out.println("Enter existing name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name");
        String newName = scanner.nextLine();
        System.out.println("Enter new phone number");
        String newPhone = scanner.nextLine();
        Contact newContact = Contact.newContact(newName, newPhone);
        if (mobilePhone.updateContact(existingContactRecord,newContact)) {
            System.out.println("Successfully updated record.");
        } else {
            System.out.println("Error updating record");
        }
    }

    private static void removeContact () {
        System.out.println("Enter existing name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted record.");
        } else {
            System.out.println("Error deleted record");
        }
    }

    private static void queryContact () {
        System.out.println("Enter existing name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() +
                ", phone: " + existingContactRecord.getNumber());
    }

    private static void printActions() {
        System.out.println("\n available actions: \npress: ");
        System.out.println("0 - to shutdown\n " +
                "1 - to print contacts\n " +
                "2 - to add a new contact\n " +
                "3 - to update contact\n " +
                "4 - to remove contact\n " +
                "5 - query if an existing contact exist\n " +
                "6 - list of available actions");
        System.out.println("Choose your action: ");
    }
}
