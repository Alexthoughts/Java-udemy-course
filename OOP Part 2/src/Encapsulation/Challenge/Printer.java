package Encapsulation.Challenge;

public class Printer {
    private int tonerLevel;
    private int printedPages;
    private boolean duplexPrint; //с двух сторон

    public Printer(int tonerLevel, boolean duplexPrint) {
        if (tonerLevel > 100) {
            System.out.println("Max toner level is 100");
        } else if (tonerLevel < 0){
            this.tonerLevel = 0;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.duplexPrint = duplexPrint;
    }

    public int fillUpToner(int addToner) {
        if (this.tonerLevel + addToner < 100) {
            this.tonerLevel = this.tonerLevel + addToner;
            System.out.println("New toner level " + this.tonerLevel);
            return this.tonerLevel;
        } else {
            System.out.println("Max toner level is 100");
            return this.tonerLevel;
        }
    }

    public void printPage (int needToPrint) {
        while (needToPrint > 0) {
            if (this.tonerLevel - (needToPrint * 5) < 0) {
                System.out.println("Toner is empty");
                break;
            } else {
                if (duplexPrint == false) {
                    printedPages = printedPages + 1;
                    this.tonerLevel = this.tonerLevel - 5;
                    needToPrint--;
                } else {
                    printedPages = printedPages + 2;
                    this.tonerLevel = this.tonerLevel - 10;
                    needToPrint = needToPrint - 2;
                }
            }
            System.out.println("Printed pages " + printedPages);
        }
        printedPages = 0;
    }


}
