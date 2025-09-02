package While;

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
    }
    public static int sumDigits(int number){
        if (number < 10){
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            //int = целое число
            //125/10=12 -> 12*10=120 -> 125-120=5
            // 12/10=1 -> 1*10=10 -> 12-10=2
            //1/10=0 -> 0*10=0 -> 1-0=1
            sum += (number % 10);
            //125/10=12
            //12/10=1
            //1/10<0 -> return sum
            number /= 10;
        }
        return sum;
    }
}
