public class TeenNumberChecker {
    public static void main(String[] args) {
        hasTeen(9,99,11);
        isTeen(10);
    }

    public static boolean hasTeen(int fir, int sec, int thi) {
        if (fir >= 13 && fir <= 19 || sec >= 13 && sec <= 19 || thi >= 13 && thi <= 19) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }
    public static boolean isTeen (int fou){
        if (fou >= 13 && fou <= 19){
            System.out.println("true2");
            return true;
        }
        System.out.println("false2");
        return false;
    }
}
