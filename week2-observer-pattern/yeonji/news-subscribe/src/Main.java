public class Main {
    public static void main(String[] args) {
        NewsPublisher newsPublisher = new NewsPublisher();
        SMSSubscriber smsSubscriber = new SMSSubscriber();
        EmailSubscriber emailSubscriber = new EmailSubscriber();

        newsPublisher.addObserver(smsSubscriber);
        newsPublisher.addObserver(emailSubscriber);
        newsPublisher.publish();
    }
}