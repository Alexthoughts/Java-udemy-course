public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 23));
    }
    public static boolean shouldWakeUp (boolean barking, int HourOfDay) {
        if (HourOfDay >= 0 && HourOfDay <= 23) {

            if (HourOfDay < 8 | HourOfDay > 22 && barking == true) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
