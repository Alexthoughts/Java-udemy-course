package While;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(19,26));
    }
    public static boolean hasSharedDigit (int firstNumber, int secondNumber){
        if (firstNumber < 10 || secondNumber >99 || secondNumber < 10 || firstNumber > 99){
            return false;
        }
            int firstDigitFN = 0;
            int secondDigitFN = 0;
            int firstDigitSN = 0;
            int secondDigitSN = 0;

            secondDigitFN = firstNumber % 10;
            firstNumber = firstNumber / 10;
            firstDigitFN = firstNumber % 10;

            secondDigitSN = secondNumber % 10;
            secondNumber = secondNumber / 10;
            firstDigitSN = secondNumber % 10;

            if (firstDigitFN == firstDigitSN || firstDigitFN == secondDigitSN ||
                    secondDigitFN == firstDigitSN || secondDigitFN == secondDigitSN) {
                return true;
            }
        return false;
    }
}
