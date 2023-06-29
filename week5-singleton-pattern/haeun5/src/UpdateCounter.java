public class UpdateCounter {
    public int count = 0;

    private UpdateCounter() {
    }

    private static class UpdateCounterHelper {
        private static UpdateCounter UPDATE_COUNTER = new UpdateCounter();
    }
    /* Helper 클래스는 Inner Class 로 선언되었기 때문에
     * Singleton 클래스가 Class Loader 에 의해 로딩될 때 로딩되지 않다가
     * getInstance()가 호출될 때 JVM 메모리에 로드되고 객체를 생성하게 된다.
     *
     * 또한 클래스가 로드될 때 객체가 생성되기 때문에
     * multi-thread 환경에서도 안전하게 사용이 가능하다.*/

    public static UpdateCounter getInstance() {
        return UpdateCounterHelper.UPDATE_COUNTER;
    }

    public void callUpdateMethod(String kakaoId) {
        // 메소드를 호출함
        System.out.println(kakaoId + "가 호출했기 때문에 count 하나 올립니다");
        count ++;
    }
}
