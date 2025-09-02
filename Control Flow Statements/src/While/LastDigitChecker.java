package While;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(5,65,74));
    }
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)){
            return false;
        }
        num1 = num1 % 10;
        num2 = num2 % 10;
        num3 = num3 % 10;

        if ((num1 == num2) || (num1 == num3) || num2 == num3){
            return true;
        }
        return false;
    }
    public static boolean isValid (int n){
        if (n < 10 || n > 1000){
            return false;
        }
        return true;
    }
}
