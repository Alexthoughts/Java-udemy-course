package Autoboxing_and_Unboxing;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }
    public int getMyValue() {
        return myValue;
    }
    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Tim");

      //  ArrayList<int> intArray = new ArrayList<int>();//error because primitive type isn't a class
    ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();//one way to create int Array
        //1. create int class (class IntClass{private int myValue....} with Constructor, getter, setter
        //2. use this class for int ArrayList
    intClassArrayList.add(new IntClass(54)); //add value

    //Integer integer = new Integer(54);
   // Double doubleValue = new Double(12.25);

    ArrayList<Integer> integerArrayList = new ArrayList<Integer>(); //create Integer ArrayList
    for (int i=0; i<=10; i++) {
        integerArrayList.add(Integer.valueOf(i)); //add values to Integer ArrayList
        //part Integer.valueOf(i) is autoboxing ->
        //take the value i as the primitive type and converting into the Integer class
    }
    for (int i=0;i<=10;i++) {
        System.out.println((i + " -> " + integerArrayList.get(i).intValue()));
        //unboxing -> converting back to a primitive type
    }

    Integer myIntValue = 56; //converted to Integer.valueOf(56) (autoboxing)
        int  myInt = myIntValue; //what doing -> myIntValue.intValue(); (unboxing)
    }


}
