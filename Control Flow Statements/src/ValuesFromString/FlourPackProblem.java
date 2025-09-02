package ValuesFromString;

public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(2,1,5));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        bigCount = bigCount * 5;
        int sum = bigCount + smallCount;
        if (sum >= goal) {
            if (bigCount <= goal){
                return true;
            }else
                return (smallCount >=(goal % 5));
        }
        return false;
    }
}
