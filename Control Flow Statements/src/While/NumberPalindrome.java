package While;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
    }
    //Палиндро́м — число, буквосочетание, слово или текст, одинаково читающееся в обоих направлениях.
    public static boolean isPalindrome (int number) {
        if (number < 0){
            number *= -1; //негативное число тоже может быть палиндром
        }
        int reverse = 0;
        int n = number; //для того чтобы сравнить с заданым числом
        while (n > 0) {
            int lastDigit = n % 10; //(1, 2, 2...)
            reverse = reverse * 10; //add additional place for number (0, 10, 120...)
            reverse += lastDigit; // add last digit(0+1=1, 10+2=12, 120+2=122...)
            n = (n / 10); //remove the last digit
            System.out.println("reverse = " + reverse + ", number = " + number);
        }
        if (number == reverse) {
            return true;
        } else {
            return false;
        }
    }
}
