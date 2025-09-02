package Interfaces;

public interface ITelefon { //"I" means interface
    //you can write without "public"
    public void powerOn();
    public void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
