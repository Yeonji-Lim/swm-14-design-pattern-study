import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportManager {
    Map<String, List<ReportListener>> listeners = new HashMap<>();

    public ReportManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String reportType, ReportListener listener) {
        List<ReportListener> users = listeners.get(reportType);
        users.add(listener);
    }

//    public void unsubscribe(String eventType, ReportListener listener) {
//        List<ReportListener> users = listeners.get(eventType);
//        users.remove(listener);
//    }

    public void notify(String eventType, String stampType) {
        List<ReportListener> users = listeners.get(eventType);
        for (ReportListener listener : users) {
            listener.update(eventType, stampType);
        }
    }

}
