public class Main {

    /* 커맨드 패턴
    * 모든 요청 세부 정보들(예: 호출되는 객체, 메서드 이름 및 인수 리스트)을
    * 요청을 작동시키는 단일 메서드를 가진 별도의 커맨드 클래스로 추출하라고 제안합니다.
    *
    *
    *
    * 커맨드 패턴은 발신자와 수신자 간의 단방향 연결을 설립합니다.
    * 옵서버 패턴은 수신자들이 요청들의 수신을 동적으로 구독 및 구독 취소할 수 있도록 합니다.
    *
    * 당신은 커맨드를 사용하여 모든 작업을 객체로 변환할 수 있습니다.
    * 작업의 매개변수들은 해당 객체의 필드들이 됩니다.
    * 이 변환은 작업의 실행을 연기하고,
    * 해당 작업을 대기열에 넣고,
    * 커맨드들의 기록을 저장한 후
    * 해당 커맨드들을 원격 서비스에 보내는 등의 작업을 가능하게 합니다.*/
    public static void main(String[] args) {

        Moo moo = new Moo();

        StampWithImage stampWithImage = new StampWithImage();
        Command stampWithImageOnCommand = new StampWithImageOnCommand(stampWithImage);
        moo.setCommand(stampWithImageOnCommand);
        moo.talk();

        TimeChangedStamp timeChangedStamp = new TimeChangedStamp();
        Command timeChangedStampOnCommand = new TimeChangedStampOnCommand(timeChangedStamp);
        moo.setCommand(timeChangedStampOnCommand);
        moo.talk();
    }
}