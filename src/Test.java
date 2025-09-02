public class Test {
    public static void main(String[] args) {
        double double1 = 20d;
        double double2 = 80d;
        double double3 = (double1 + double2) * 100d;
        double theReminder = double3 % 40d;

        //boolean NotReminder = true;
        boolean NotReminder = theReminder == 1 ? true : false;

        if (!NotReminder){
            System.out.println("Got some Reminder");
        }


        System.out.println(double3);
        System.out.println(theReminder);
        System.out.println(NotReminder);
    }
}
