package While;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }
    public static int getEvenDigitSum (int number){
        if (number < 0){
            return -1;
        }
        int evenNumber = 0;
        int sum = 0;
        while (number > 0){
            evenNumber = number % 10;
            if (evenNumber % 2 == 0){
                sum = sum + evenNumber;
            }
            number = number / 10;
        }
        return sum;
    }
}
