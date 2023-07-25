package repository;

import document.Email;
import document.Password;

import java.util.HashMap;

public class PasswordRepository {
    private static final HashMap<Long, Password> repository = new HashMap<>();
    private static Long sequence = 1L;

    private static final PasswordRepository passwordRepository = new PasswordRepository();

    public void save(Password password) {
        password.setId(sequence);
        repository.put(sequence++, password);
        System.out.println("PasswordRepository.save");
    }

    public void deleteById(Long id) {
        repository.remove(id);
        System.out.println("PasswordRepository.deleteById");
    }

    public Password findByUserId(Long userId) {
        for (Password password : repository.values()) if(password.getUserId().equals(userId)) return  password;
        return null;
    }

    public static PasswordRepository getPasswordRepository() {
        return passwordRepository;
    }

    private PasswordRepository() {
    }
}
