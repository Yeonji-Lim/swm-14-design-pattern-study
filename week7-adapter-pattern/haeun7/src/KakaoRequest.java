import java.time.LocalDateTime;

public class KakaoRequest {

    private LocalDateTime localDateTime;

    public KakaoRequest() {
    }

    public KakaoRequest(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
}
