package Interfaces;

public class Main {
    public static void main(String[] args) {
        ITelefon myPhone;
//        DeskPhone myPhone; //the same result. use interface or class
        myPhone = new DeskPhone(123456);
        myPhone.powerOn();
        myPhone.callPhone(123456);
        myPhone.answer();

        myPhone = new MobilePhone(987654);
        myPhone.powerOn();
        myPhone.callPhone(987654);
        myPhone.answer();
    }
}
