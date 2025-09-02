public class main {
    public static void main(String[] args) {

        int highScore = calculateScore(true, 15, 10); // параметры должны отвечать настройкам метода
        System.out.println("Your final score = " + highScore);

        highScore = calculateScore(false, 20, 20);
        System.out.println("Your final score = " + highScore);
    }

    public static int calculateScore(boolean gameOver, int score, int score2) {

        if (gameOver) {
            int finalScore = score * score2;
            finalScore +=1000;
            return finalScore;
        }
        else {
            return -1; //-1 used to indicate an error
        }
    }
}
