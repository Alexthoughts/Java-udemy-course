public class Main {
    public static void main(String[] args) {
     int newScore = calculateScore("Alex",500);
     System.out.println("New score " + newScore);
     calculateScore(75);
     calculateScore();
    }
    public static int calculateScore (String playerName, int score){
        System.out.println("Player " + playerName + " score " + score + " points");
        return score * 1000;
    }
    public static int calculateScore (int score){
        System.out.println("Unnamed player score " + score + " points");
        return score * 1000;
    }
    public static int calculateScore (){
        System.out.println("Unnamed player and no score");
        return 0;
    }
   /* public static void calculateScore (){ // need to change to unique number of parameters to make it unique
        System.out.println("Unnamed player and no score");
    }
    */
}
