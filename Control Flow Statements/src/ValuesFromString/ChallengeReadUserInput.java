package ValuesFromString;

import java.util.Scanner;

public class ChallengeReadUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfNumbers = 0;
        int count = 1;
        while (count <= 10){
            System.out.println("Enter number #" + count);
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                int number = scanner.nextInt();
               sumOfNumbers =sumOfNumbers + number;
               count ++;
            }else {
                System.out.println("Invalid number");
                break;
            }
        }
        System.out.println("Sum of numbers = " + sumOfNumbers);
        scanner.close();
    }
}
