package While;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12,30));
    }
    public static int getGreatestCommonDivisor (int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }
        int divisor = 0;
        int greatestCommonDivisor = 0;
        while (divisor <= first || divisor <= second){
            divisor ++;
            if (first % divisor == 0 && second % divisor == 0){
                greatestCommonDivisor = divisor;
            }
            }
        return greatestCommonDivisor; // наибольший общий делитель
        //т.к. это последнее число, которое возвращает While
    }
}
