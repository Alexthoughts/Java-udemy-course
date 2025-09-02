public class test {
    public static void main (String[] args) {
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Alex", position);
        position = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", position);
        position = calculateHighScorePosition(400);
        displayHighScorePosition("Martin", position);
        position = calculateHighScorePosition(50);
        displayHighScorePosition("Vlad", position);

    }

        public static void displayHighScorePosition (String name, int position){
        System.out.println(name + " managed to get into position: " + position + " on the high score table");
    }

    public static int calculateHighScorePosition (int score){
        //int position;
        if (score>1000){
            //position = 1;
           return 1;
        }
        else if (score>500&&score<1000){
            //position = 2;
            return 2;
        }
        else if (score>100&&score<500){
            //position = 3;
           return 3;
        }
        else {
            //position = 4;
            return 4;
        }

    }
}
