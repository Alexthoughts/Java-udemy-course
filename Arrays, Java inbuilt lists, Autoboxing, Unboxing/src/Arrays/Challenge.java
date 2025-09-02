package Arrays;

import java.util.Scanner;

public class Challenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] integers = getIntegers(5);
        int[] sorted = sortIntegers(integers);
        printArray(integers);
        sortIntegers(integers);
        printArray(sorted);
    }

    public static int[] getIntegers(int numbers) {
        System.out.println("Enter " + numbers + " numbers" + "\r");
        int[] values = new int[numbers];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Number " + i + " = " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] newArray) {
        int[] sortedArray = new int[newArray.length]; //create new array with same length
            for (int i = 0; i < newArray.length; i++) {
                sortedArray[i] = newArray[i]; //two same arrays
            }
            boolean flag = true;
            int temp;
            while (flag) {
//                element 0 = 50
//                element 1 = 160
//                element 2 = 40
                flag = false; //if array hasn't got all numbers -> continue
                for (int i=0; i<sortedArray.length-1; i++) {
                    //one ending element always one less than the total length
                    if (sortedArray[i] < sortedArray[i+1]) { //первый элемент больше второго (50<160)
                    temp = sortedArray[i]; //store the current value of the sortedArray
                        // next 3 lines = перемещаем элемент с позиции 1 на 0
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                    }
//                   переместили 160 на первое место
//                   element 0 = 160
//                   element 1 = 50
                }
            }
        return sortedArray;
    }
}
