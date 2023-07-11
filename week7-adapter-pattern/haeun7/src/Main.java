import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        KakaoFormat kakaoFormat = new KakaoFormat(LocalDateTime.now());
        KakaoAdapter kakaoAdapter = new KakaoAdapter(kakaoFormat);
        System.out.println("kakaoAdapter.getLocalDateTime() = " + kakaoAdapter.getLocalDateTime());

    }
}