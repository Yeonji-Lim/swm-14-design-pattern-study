package repository;

import document.User;

import java.util.HashMap;

public class UserRepository {

    private static final HashMap<Long, User> repository = new HashMap<>();
    private static Long sequence = 1L;

    private static UserRepository userRepository = new UserRepository();

    public Long save(User user) {
        user.setId(sequence);
        repository.put(sequence, user);
        System.out.println("UserRepository.save");
        return sequence++;
    }

    public void deleteById(Long id) {
        repository.remove(id);
        System.out.println("UserRepository.deleteById");
    }

    public static UserRepository getUserRepository() {
        return userRepository;
    }

    private UserRepository() {
    }
}
