package ValuesFromString;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int count = 1;
        while (true){
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                int number = scanner.nextInt();
                sum = sum + number;
                average = Math.round((double)sum / count); //округляем число
                count++;
            }else {
                break;
            }
            }
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}
