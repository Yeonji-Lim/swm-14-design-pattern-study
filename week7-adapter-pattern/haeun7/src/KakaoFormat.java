import java.time.LocalDateTime;
import java.util.HashMap;

public class KakaoFormat {
    private LocalDateTime localDateTime;

    public KakaoFormat() {
    }

    public KakaoFormat(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public HashMap<String, Object> getLocalDateTimeReal() {
        HashMap<String, Object> action = new HashMap<>();
        HashMap<String, Object> detailParams = new HashMap<>();
        HashMap<String, Object> target = new HashMap<>();
        HashMap<String, Object> origin = new HashMap<>();

        origin.put("origin", localDateTime);
        target.put("sys_time", origin);
        detailParams.put("detailParams", target);
        action.put("action", detailParams);

        return action;
    }

    public HashMap<String, Object> getLocalDateTime() {
        HashMap<String, Object> action = new HashMap<>();

        action.put("action", localDateTime);

        return action;
    }
}