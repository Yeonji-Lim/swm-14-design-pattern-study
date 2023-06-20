package test;

import main.UserRepository;

public class Task implements Runnable {

    @Override
    public void run() {
        UserRepository userRepository = UserRepository.getInstance();
        for (int i = 0; i < 100000; i++) {
            userRepository.addCount();
            int count = userRepository.getCount();
        }
    }
}
