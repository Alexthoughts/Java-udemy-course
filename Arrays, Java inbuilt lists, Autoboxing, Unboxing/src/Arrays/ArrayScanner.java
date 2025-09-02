package Arrays;
import java.util.Scanner;

public class ArrayScanner {
    private static Scanner scanner = new Scanner(System.in); //type input in the console

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5); //нужно ввести 5 чисел
        for (int i=0; i<myIntegers.length;i++) {
            System.out.println("Element " + i + ", value is " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers (int number) { //ввод чисел
        System.out.println("Enter number " + number + " integer values. \r");
        int[] values = new int[number]; //довавление введёных чисел в array

        for (int i=0;i<values.length;i++) {
            //automatically accepts an int from the console and return an int and stored in our array
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int array[]) { //average number from array
        int sum = 0;
        for (int i=0;i<array.length;i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }
}
