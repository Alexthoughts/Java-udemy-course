package Arrays;

public class Main {
    public static void main(String[] args) {
       //int[] myIntArray = new int[10]; //create int Array for 10 variables
        //myIntArray[5] = 50; //element 6 (begin 0) = 50
        //int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
        int[] myIntArray = new int[10]; //automatic se array from 0 to 10 as a previous line
        // System.out.println(myIntArray[5]); //print 6 element

        for (int i=0;i<myIntArray.length;i++) {
            myIntArray[i] = i*10; //each element * 10
        }
        printArray(myIntArray);
    }
    public static void printArray(int[] array) {
        for (int i=0;i<array.length;i++) {
            System.out.println(array[i]); //print all the elements
        }
    }
}
