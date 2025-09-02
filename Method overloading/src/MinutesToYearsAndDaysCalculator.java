public class MinutesToYearsAndDaysCalculator {
    //private static String INVALID_VALUE = "Invalid value";
    public static void main(String[] args) {
        printYearsAndDays(1051200);
    }
    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
             System.out.println("Invalid Value");
        }else {
            long years = ((minutes / 60) / 24) / 365;
            long remainingDays = ((minutes / 60) / 24) % 365;

            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
        }
}
