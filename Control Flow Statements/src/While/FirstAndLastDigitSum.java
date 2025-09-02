package While;

public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        sumFirstAndLastDigit(0);
    }
    public static int sumFirstAndLastDigit (int number){
        if (number < 0){
            return -1;
        }
        int lastDigit = number % 10;
        int firstDigit = 0;
        while (number > 0) {
            firstDigit = number % 10; //делим на 10 пока не останется последнее число
            number = number/10; //убираем послднее число, чтобы цикл небыл бесконечный
        }
        int sum = lastDigit + firstDigit;
        System.out.println(lastDigit + " + " + firstDigit + " = " + sum);
           return sum;
    }
}
