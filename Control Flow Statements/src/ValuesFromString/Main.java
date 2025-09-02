package ValuesFromString;

public class Main {
    public static void main(String[] args) {
        String numberAsString = "2018"; //if "2018a" -> error (can't do +1)
        int number = Integer.parseInt(numberAsString); //convert String to int
        double n = Double.parseDouble(numberAsString); //conver String to double
        numberAsString += 1;
        number += 1;
        System.out.println("numberAsString = " + numberAsString);
        System.out.println(number);
    }
}
