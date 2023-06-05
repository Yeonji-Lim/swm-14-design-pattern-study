import java.util.Observable;
import java.util.Observer;

public class EmailSubscriber implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg + " 가 이메일로 보내짐");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
