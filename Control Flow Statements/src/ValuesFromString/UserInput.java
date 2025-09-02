package ValuesFromString;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();//Check if you print int
        if (hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); //to read next input (name)

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2020 - yearOfBirth;

            System.out.println("Your name is " + name);
            if (age >=0 && age <=120) {
                System.out.println("Your age: " + age);
            }else {
                System.out.println("Invalid year of birth");
            }
        }else {
            System.out.println("Please, enter a year");
        }
        scanner.close();
    }
}
