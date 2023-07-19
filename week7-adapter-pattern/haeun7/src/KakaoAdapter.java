import java.time.LocalDateTime;

public class KakaoAdapter extends KakaoRequest {
    private KakaoFormat kakaoFormat;

    public KakaoAdapter(KakaoFormat kakaoFormat) {
        this.kakaoFormat = kakaoFormat;
    }

    @Override
    public LocalDateTime getLocalDateTime() {
        String strDate = kakaoFormat.getLocalDateTime().get("action").toString();
        return LocalDateTime.parse(strDate);
    }
}