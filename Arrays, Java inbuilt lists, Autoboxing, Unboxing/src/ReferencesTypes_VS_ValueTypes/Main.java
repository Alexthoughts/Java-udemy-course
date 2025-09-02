package ReferencesTypes_VS_ValueTypes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //сохраняем два одинаковый int, int[] в памяти
        int myIntValue = 10;
        int anotherInt = myIntValue; //=10

        anotherInt++; //=11

        int[] myIntArray = new int[3];
        int[] anotherArray = myIntArray;
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));//0 0 0
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));//0 0 0

        anotherArray[0] = 1;
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));//1 0 0
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));//1 0 0
    }
}
