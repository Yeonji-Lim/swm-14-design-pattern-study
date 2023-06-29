public class Main {
    public static void main(String[] args) {
        // updateCounter 로드
        UpdateCounter updateCounter = UpdateCounter.getInstance();
        // 초기값은 0
        System.out.println(updateCounter.count);
        // callUpdateMethod 호출할 때마다 count ++
        updateCounter.callUpdateMethod("kakaoId1");
        updateCounter.callUpdateMethod("kakaoId2");
        // 예상 = 2 = (초기값 0) + (호출 시 +1) * 2
        System.out.println(updateCounter.count);

        // 새로운 otherUpdateCounter 를 로드하려고 해도
        UpdateCounter otherUpdateCounter = UpdateCounter.getInstance();
        // count는 마찬가지로 2 (로드되어있던 UpdateCounter 가 호출되었기 때문)
        System.out.println(otherUpdateCounter.count);
    }
}