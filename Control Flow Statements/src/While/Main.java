package While;

public class Main {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int countEvenNumber = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue; //возврат на while
            }//если if (false) - продолжаем до конца while
            System.out.println("Even number " + number);
            countEvenNumber++;
            if (countEvenNumber >= 5) {
                break;
            }
        }
        System.out.println("Count number " + countEvenNumber);
    }
    public static boolean isEvenNumber (int number){
        if (number % 2 == 0){
            return true;
        }else {
            return false;
        }
    }
}
