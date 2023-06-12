public class Client {
    public static void main(String[] args) {
        String data = "피곤-집가고 싶다";

        // 기본 스탬프리스트만 출력
        DataSource free = new LoadDataSource();
        free.writeData(data);
        System.out.println();

        // 기본 스탬프리스트 + AI 일기
        DataSource basic = new AIDiaryDecorator(new LoadDataSource());
        basic.writeData(data);
        System.out.println();

        // 기본 스탬프리스트 + AI 일기 + 제목
        DataSource advanced = new TitleDecorator(new AIDiaryDecorator(new LoadDataSource()));
        advanced.writeData(data);
        System.out.println();

    }
}