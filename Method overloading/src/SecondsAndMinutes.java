public class SecondsAndMinutes {
    //calculate how many hours, minutes and seconds
    // equal the sec. and min. passed to the method
    private static final String INVALID_VALUE = "Invalid value";
    public static void main(String[] args) {
        System.out.println(getDurationString(3750));
    }
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0) {
            return INVALID_VALUE;
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + "h" + remainingMinutes + "m" + seconds + "s";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE;
        }
        int minutes = seconds / 60;
        int remainingSeconds = minutes % 60;
        return getDurationString(minutes, remainingSeconds);
    }
}
