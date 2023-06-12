public class AIDiaryDecorator extends DataSourceDecorator{

        public AIDiaryDecorator(DataSource source) {
            super(source);
        }

        @Override
        public void writeData(String data) {
            super.writeData(data);
            aiWriteData();
        }

        private void aiWriteData() {
            System.out.println("\tAI 일기 생성");
        }
}
