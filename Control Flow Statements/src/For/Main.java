package For;

public class Main {
    public static void main(String[] args) {
        /*
        for (int i = 8; i >= 2; i--) {
            System.out.println((String.format("%.2f",calculateInterest(10000, i))));
            //String.format("%.2f") - форматирование до двух знаков после запятой
        }
        System.out.println("*****************************");
        //в обратном порядке
        for (int i = 2; i <= 8; i++) {
            System.out.println((String.format("%.2f",calculateInterest(10000, i))));
        }

         */

        int count = 0;
        for (int b=10; b<50; b++){
            if (isPrime(b)){
                count++;
                System.out.println("Number " + b + ", count " + count);
                if (count == 3){
                    break; //exiting for loop
                }
            }
        }

    }
    public static double calculateInterest (double amount, double interestRate) {
        return (amount * (interestRate / 100));

    }


        public static boolean isPrime (int n) {
        if (n == 1){
            return false;
        }
        for (int i=2; i<=n/2; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
        }
}
