package While;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }
    public static boolean isPerfectNumber (int number){
        if (number < 1){
            return false;
        }
        int divisor = 1;
        int sumOfDivisors = 0;
        while (divisor < number){
            if (number % divisor == 0) {
                sumOfDivisors += divisor;
                System.out.println(sumOfDivisors);
            }
            divisor++;
        }
        if (sumOfDivisors == number){
            return true;
        }
        return false;
    }
}
