import java.sql.Struct;
import java.time.LocalDate;

public abstract class ScoreTemplate {

    public static class ScoreDto {
        private boolean isWinner;
        private int myScore;
        private int secondScore;
        private int rank;
        public ScoreDto(boolean isWinner, int myScore, int secondScore, int rank) {
            this.isWinner = isWinner;
            this.myScore = myScore;
            this.secondScore = secondScore;
            this.rank = rank;
        }

        public boolean isWinner() {
            return isWinner;
        }

        public String myScore() {
            return String.valueOf(myScore);
        }

        public String secondScore() {
            return String.valueOf(secondScore);
        }

        public String rank() {
            return String.valueOf(rank);
        }
    }

    public final void getScoreBoard(String id) {
        int month = getMonth();
        ScoreDto scoreDto = validateIsWinnerForThisWeek(month, id);
        printMesage(month, scoreDto);
    }

    public abstract int getMonth();

    public ScoreDto validateIsWinnerForThisWeek(int month, String id) {
        // month 에 따라 winner 를 찾지만 ... 코드 생략
        if (id.equals("winner"))
            return new ScoreDto(true, 101, 90, 1);
        else return new ScoreDto(false, 67, -1, 6);
    }

    public abstract void printMesage(int month, ScoreDto scoreDto);
}