package Switch;

public class GetDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(3, 2018));
    }
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    return year % 400 == 0;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static int getDaysInMonth (int month, int year){
        int days = 0;
        if (month < 1 || month > 12){
            return -1;
        }else if (year < 1 || year > 9999){
            return -1;
        }
        if (isLeapYear(year) == true && month == 2){
           return days = 29;
        }
            switch (month){
                case 1: days = 31;
                break;
                case 2: days = 28;
                break;
                case 3: days = 31;
                break;
                case 4: days = 30;
                break;
                case 5: days = 31;
                break;
                case 6: days = 30;
                break;
                case 7: days = 31;
                break;
                case 8: days = 31;
                break;
                case 9: days = 30;
                break;
                case 10: days = 31;
                break;
                case 11: days = 30;
                break;
                case 12: days = 31;
                break;
                default: System.out.println("Invalid Value");
                break;
            }
        return days;
        }
    }

