package repository;

import document.Email;
import document.Username;

import java.util.HashMap;

public class UsernameRepository {
    private static final HashMap<Long, Username> repository = new HashMap<>();
    private static Long sequence = 1L;

    private static final UsernameRepository usernameRepository = new UsernameRepository();

    public void save(Username username) {
        username.setId(sequence);
        repository.put(sequence++, username);
        System.out.println("UsernameRepository.save");
    }

    public void deleteById(Long id) {
        repository.remove(id);
        System.out.println("UsernameRepository.deleteById");
    }

    public Username findByUserId(Long userId) {
        for (Username username : repository.values()) if (username.getUserId().equals(userId)) return username;
        return null;
    }

    public static UsernameRepository getUsernameRepository() {
        return usernameRepository;
    }

    private UsernameRepository() {
    }
}
