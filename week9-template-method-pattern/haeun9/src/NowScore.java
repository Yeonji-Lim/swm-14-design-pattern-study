import java.time.LocalDate;

public class NowScore extends ScoreTemplate{
    @Override
    public int getMonth() {
        return LocalDate.now().getMonthValue();
    }

    @Override
    public void printMesage(int month, ScoreDto scoreDto) {
        System.out.println("🥬 " + month + "월 랭킹 (" + LocalDate.now() + "기준) 🥬" +
                "\n==========");

        if (scoreDto.isWinner())
            System.out.println("축하한다무! 총 스탬프 " + scoreDto.myScore() + "개로 1등이다무." +
                "\n2등의 개수는 🤫" + scoreDto.secondScore() + "개!🤫");
        else System.out.println("현재 Loser 님 앞에 👀" + scoreDto.rank() + "명이 있다무...!👀" +
                "\n(내 스탬프 개수 : " + scoreDto.myScore() + "개)");
    }
}
