public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0, 4.0));
    }
    public static double area (double radius){
        if (radius < 0){
            return -1;
        }
        double circleArea = radius * radius * Math.PI;
        return circleArea;
    }
    public static double area (double x, double y) {
        if (x < 0 || y < 0){
            return -1;
        }
        double rectengularArea = x * y;
        return rectengularArea;
    }
}
