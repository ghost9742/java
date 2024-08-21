public class Main {
    public static void main(String[] args) {
    int newScore = calculateScore("Tim", 500);
    System.out.println(newScore);
    float floatScore = calculateScore("TimFloat", 1000.1f);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static float calculateScore(String playerName, float score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
}
