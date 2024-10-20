public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 10;
        int bonus = 100;

      int highScore =  calculateScore(gameOver, score, levelCompleted, bonus);
      System.out.println("Highscore " + highScore);
      System.out.println("The next highScore is " + calculateScore(true, 1000, 5, 100));

      displayHighScorePosition("Tim", 5);
      int highScorePos = calculateHighScorePosition(550);
      System.out.println(highScorePos);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }

    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + "managed to get into position " + playerPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore){
        int position = 4;
        if (playerScore >= 1000) {
            position =  1;
        }
        else if (playerScore >= 500 ) {
            position =  2;
        }
        else if (playerScore >= 100 ) {
            position =  3;
        }
            return position;
    }
}

