package ArrayList.Challenge_Contacts;

public class Contact {

    private String name;
    private String number;

    public Contact(String name, String number) { //constructor
        this.name = name ;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public static Contact newContact(String name, String number) {
        return new Contact(name,number); //calling a constructor to create a contact
    }
}
