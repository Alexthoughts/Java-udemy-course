public class SpeedConverter {
    public static void main(String[] args) {

        printConversion(1.5);

    }
    public static long toMilesPerHour (double kilometrsPerHour) {
        if (kilometrsPerHour < 0) {
            return -1;
        }
            return Math.round(kilometrsPerHour / 1.609);

    }
    public static void printConversion (double kilometrsPerHour){
        if (kilometrsPerHour<0){
            System.out.println("Invalid Value");
        }
        else {
            long milesPerHour = toMilesPerHour(kilometrsPerHour);
            System.out.println(kilometrsPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
