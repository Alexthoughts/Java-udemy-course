package While;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(100);
    }
    public static void numberToWords(int number){
        int reverseNumber = reverse(number);
        int countDigitReverseNumber = getDigitCount(reverseNumber);
        int countDigitNumber = getDigitCount(number);
        if (number < 0){
            System.out.println("Invalid Value");
        }
        if (number == 0){
            System.out.println("Zero");
        }
        int lastNumber = 1;
        while (reverseNumber != 0) {
            lastNumber = reverseNumber % 10;
            switch (lastNumber) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reverseNumber = reverseNumber / 10;
        }
        for (; countDigitNumber > countDigitReverseNumber; countDigitReverseNumber++){
            System.out.println("Zero"); //дописываем нули, число=100 -> обратное=1 -> дописать 00
        }
    }

    public static int reverse(int number){ //число задам наперед
        int reverseNumber = 0;
        while (number !=0) {
            reverseNumber = reverseNumber * 10; //добавляем 1 знак
            reverseNumber += number % 10; // + последнее число number
            number = number / 10; //убираем последний знак
        }
        return reverseNumber;
    }
    public static int getDigitCount(int number){ //кол-во цифр в числе
        int countDigit = 0;
        if (number < 0){
            return -1;
        } else if (number == 0){
            countDigit = 1;
        }else {
            while (number > 0) {
                countDigit++;
                number = number / 10; //убираем последний знак
            }
        }
        return countDigit;
    }
}
