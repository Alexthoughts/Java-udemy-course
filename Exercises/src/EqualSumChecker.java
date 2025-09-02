public class EqualSumChecker {
    public static void main(String[] args) {
hasEqualSum(1,-1,0);
    }
    public static boolean hasEqualSum (int fir, int sec, int thi){
        if (fir + sec == thi){
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }
}
