import java.util.*;

public class NewsPublisher extends Observable {

    private List<String> newsList;
    private Random random = new Random();

    public NewsPublisher() {
        newsList = new ArrayList<String>();
        for(int i = 0; i < 20; i++) {
            newsList.add("뉴스"+i);
        }
    }

    public void publish() {
        for (int i = 0; i < 10; i++) {
            setChanged(); // 변경을 알려줌
            String publishedNews = newsList.get(random.nextInt(20));
            notifyObservers(publishedNews);
        }
    }
}
