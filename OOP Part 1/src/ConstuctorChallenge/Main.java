package ConstuctorChallenge;

public class Main {
    public static void main(String[] args) {
ComplexNumber one = new ComplexNumber(1.0,1.0);
ComplexNumber number = new ComplexNumber(2.5,-1.5);
one.add(1,1);
System.out.println(one.getReal());
System.out.println(one.getImaginary());
one.subtract(number);
System.out.println(one.getReal());
number.subtract(one);
System.out.println(number.getReal());



        /*
        Point first = new Point(6,5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2, 2)= " + first.distance(2,2));
        Point point = new Point();
        System.out.println(point.distance());
         */
    }
}
