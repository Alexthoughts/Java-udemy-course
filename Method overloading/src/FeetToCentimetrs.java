public class FeetToCentimetrs {
    public static void main(String[] args) {
        CalcFeetAndInchesToCentimeters(100);
    }
    public static double CalcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet < 0 || inches < 0 && inches > 12) {
            System.out.println("Invalid feet or inches");
            return -1;
        }
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
            return centimeters;
    }
    public static double CalcFeetAndInchesToCentimeters (double inches){
        if (inches >= 0){
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches = " + feet + " feet and " + remainingInches + " inches");
            return CalcFeetAndInchesToCentimeters(feet,remainingInches);
        }
        return -1;
    }
}
