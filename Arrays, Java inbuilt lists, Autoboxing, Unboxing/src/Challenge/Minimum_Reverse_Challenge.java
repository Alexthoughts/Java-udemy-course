package Challenge;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Reverse_Challenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5};
//        int[] myArray = readIntegers(3);
//      System.out.println(Arrays.toString(myArray));
//      System.out.println(findMin(myArray));
      reverse(myArray);
    }

    private static int[] readIntegers(int count) {
        System.out.println("Enter " + count + " number");
        int[] array = new int[count]; //create array
        for (int i=0;i<array.length;i++) {
            array[i] = scanner.nextInt(); //add numbers to array
        }
        return array;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i=0;i<array.length;i++){
            int value = array[i];
            if (value<min){
                min = value;
            }
        }
        return min;
    }

    private static void reverse (int[] array) {
//        нашли длину списка
//        взяли последнее число
//        заменяем числа в новом списке
        int[] reverseArray = array; //новый список
        System.out.println(Arrays.toString(array));

        //чтобы найти последнее число (длина 3, последнее число на позиции 2)
        int arrayLength = array.length-1;
        int lastArrayNumber = array[arrayLength];

        for (int i=0;i<array.length;i++) {
            reverseArray[i] = lastArrayNumber;
            lastArrayNumber--;
        }
        System.out.println(Arrays.toString(reverseArray));
    }
}
