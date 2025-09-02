package ValuesFromString;

import java.util.Scanner;

public class ChallengeMinAndMaxInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber = 0;
        int minNumber = 0;
        while (true) {
            System.out.println("Enter number:");
            boolean hasNextInt = scanner.hasNextInt(); //Check if you print int
            if (hasNextInt) {
                int number = scanner.nextInt(); //берём введённое число
                if (number > maxNumber){
                    maxNumber = number;
                } else if (number < minNumber){
                    minNumber = number;
                } else {
                    continue;
                }
            } else {
                break;
            }
        }
        System.out.println("MinN = " + minNumber + ", MaxN = " + maxNumber);
        scanner.close();
        }
    }

