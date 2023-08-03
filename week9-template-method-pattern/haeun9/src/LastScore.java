import java.time.LocalDate;

public class LastScore extends ScoreTemplate{
    @Override
    public int getMonth() {
        return LocalDate.now().getMonthValue() - 1;
    }

    @Override
    public void printMesage(int month, ScoreDto scoreDto) {
        System.out.println("🥬 " + month + "월 랭킹 🥬" + "\n==========");

        if (scoreDto.isWinner())
            System.out.println("축하한다무! 총 스탬프 " + scoreDto.myScore() + "개로 1등이다무." +
                    "\n2등의 개수는 🤫" + scoreDto.secondScore() + "개였다무!🤫");
        else System.out.println("아쉽게도 지난 달에는 1위를 하지 못했다무" +
                "\n(내 스탬프 개수 : " + scoreDto.myScore() + "개)" +
                "\n하지만 걱정하지 말라무!" +
                "\n지난 기록과는 별개로, 이번 달에 찍은 스탬프로 다시 한 번 1등에 도전할 수 있다무🔥");
    }
}
