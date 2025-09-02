package ValuesFromString;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        //getLargestPrime(21);
    }
    //prime - простое число, делется только на 1 и на себя
    //largest prime number that divides n
    public static int getLargestPrime(int number) {
        if (number < 0) {
            return -1;
        }
        int primeDivisor = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0 && primeNumber(i)) {
                primeDivisor = i;
            }
        }
        return primeDivisor;
    }
        //check if number is prime
    public static boolean primeNumber (int primeNumber){
        int countPrimeNumbers = 0;
        for (int i = 1; i <= primeNumber; i++){
            if (primeNumber % i == 0) {
                countPrimeNumbers++;
            }
            if (countPrimeNumbers > 2) {
                return false;
            }
    }
        return true;
}
}
