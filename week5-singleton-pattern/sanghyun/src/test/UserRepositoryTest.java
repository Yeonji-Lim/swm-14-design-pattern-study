package test;

import main.UserRepository;
import org.junit.jupiter.api.Test;

public class UserRepositoryTest {

    /**
     * 동시성 문제
     */
    @Test
    public void concurrencyProblem() {
        Task task = new Task();
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        // 2개의 쓰레드가 종료될때까지
        while(thread1.isAlive() || thread2.isAlive()) {
        }

        int count = UserRepository.getInstance().getCount();
        System.out.println("예상 count : 200000");
        System.out.println("실제 count : " + count);
        System.out.println("동시성 문제 발생!");



    }

}