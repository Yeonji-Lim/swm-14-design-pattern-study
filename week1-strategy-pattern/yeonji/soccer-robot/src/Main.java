public class Main {
    public static void main(String[] args) {
        System.out.println("지금부터 축구 로봇 경기를 시작하겠습니다.");

        SoccerRobot robot1 = new SoccerRobot("로봇1");
        SoccerRobot robot2 = new SoccerRobot("로봇2");

        robot1.setPlayStrategy(new throwStrategy());
        robot2.setPlayStrategy(new trapStrategy());

        robot1.play();
        robot2.play();

        System.out.println("경기 종료");
    }
}