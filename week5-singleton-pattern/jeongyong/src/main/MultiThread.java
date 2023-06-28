package main;

public class MultiThread extends Thread {
    private String name;
    public MultiThread(String name) {
        this.name = name;
    }
    public void run() {
        int count = 0;
        for (int i = 0; i < 5; i++)
        {
            count++;
            Singleton singleton = Singleton.getInstance();
            System.out.println(name + " : " + count + "번째 호출된 객체 : " + singleton.toString());
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
