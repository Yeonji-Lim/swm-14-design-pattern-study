package repository;

import document.Email;
import document.User;

import java.util.HashMap;
import java.util.Optional;

public class EmailRepository {
    private static final HashMap<Long, Email> repository = new HashMap<>();
    private static Long sequence = 1L;

    private static final EmailRepository emailRepository = new EmailRepository();

    public void save(Email email) {
        email.setId(sequence);
        repository.put(sequence++, email);
        System.out.println("EmailRepository.save");
    }

    public void deleteById(Long id) {
        repository.remove(id);
        System.out.println("EmailRepository.deleteById");
    }

    public Email findByUserId(Long userId) {
        for (Email email : repository.values()) if(email.getUserId().equals(userId)) return email;
        return null;
    }

    public static EmailRepository getEmailRepository() {
        return emailRepository;
    }

    private EmailRepository() {
    }
}
