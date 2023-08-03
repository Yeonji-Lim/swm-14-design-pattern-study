import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("** winner ver.\n");
        System.out.println("[for this month]\n");
        ScoreTemplate nowWinnerScore = new NowScore();
        nowWinnerScore.getScoreBoard("winner");
        System.out.println("\n[for last month]\n");
        ScoreTemplate lastWinnerScore = new LastScore();
        lastWinnerScore.getScoreBoard("winner");

        System.out.println("\n\n** loser ver.\n");
        System.out.println("[for this month]\n");
        ScoreTemplate nowLoserScore = new NowScore();
        nowLoserScore.getScoreBoard("loser");
        System.out.println("\n[for last month]\n");
        ScoreTemplate lastLoserScore = new LastScore();
        lastLoserScore.getScoreBoard("loser");

    }
}