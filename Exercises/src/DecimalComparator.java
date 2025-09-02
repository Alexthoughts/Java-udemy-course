public class DecimalComparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.1756, -3.1756);
    }
    public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double secondNumber){
        firstNumber = 3.1756;
        int fNumber = (int) firstNumber;
        float fiNumber = (float) firstNumber;
        System.out.println(firstNumber + " , " + fNumber + " , " + fiNumber);
        return true;
    }
}
