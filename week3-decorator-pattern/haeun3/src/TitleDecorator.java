public class TitleDecorator extends DataSourceDecorator{

    public TitleDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(data);
        titleWriteData();
    }

    private void titleWriteData() {
        System.out.println("\t제목 생성");
    }
}
