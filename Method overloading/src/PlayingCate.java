public class PlayingCate {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(false, 36));
    }
    public static boolean isCatPlaying (boolean summer, int temperature){
        if (temperature >= 25 && temperature <= 35 && summer == false) {
            return true;
        }else if (temperature >= 25 && temperature <= 45 && summer == true){
            return true;
        }else {
            return false;
        }
    }
}
