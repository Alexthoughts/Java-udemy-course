package Encapsulation.Challenge;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, false);
        printer.printPage(5);
        printer.fillUpToner(150);
        printer.printPage(5);
    }
}
