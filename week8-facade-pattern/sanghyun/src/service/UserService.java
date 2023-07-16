package service;

import document.*;
import repository.*;

public class UserService {

    private static final UserRepository userRepository = UserRepository.getUserRepository();
    private static final UsernameRepository usernameRepository = UsernameRepository.getUsernameRepository();
    private static final EmailRepository emailRepository = EmailRepository.getEmailRepository();
    private static final PasswordRepository passwordRepository = PasswordRepository.getPasswordRepository();
    private static final RoleRepository roleRepository = RoleRepository.getRoleRepository();

    private static final UserService userService = new UserService();

    public Long save(User user) {
        // 1. User 저장
        Long userId = userRepository.save(user);

        // 2. User Username 등록
        Username username = Username.create(userId);
        usernameRepository.save(username);

        // 3. User Email 등록
        Email email = Email.create(userId);
        emailRepository.save(email);

        // 4. User Password 등록
        Password password = Password.create(userId);
        passwordRepository.save(password);

        // 5. User Role 등록
        Role role = Role.create(userId);
        roleRepository.save(role);

        return userId;
    }

    public void getUserInfo(Long userId) {
        Username username = usernameRepository.findByUserId(userId);
        Email email = emailRepository.findByUserId(userId);
        Password password = passwordRepository.findByUserId(userId);
        Role role = roleRepository.findByUserId(userId);

        String usernameValue = (username == null) ? "null" : username.getUsername();
        System.out.println("usernameValue = " + usernameValue);

        String emailValue = (email == null) ? "null" : email.getEmail();
        System.out.println("emailValue = " + emailValue);

        String passwordValue = (password == null) ? "null" : password.getPassword();
        System.out.println("passwordValue = " + passwordValue);

        String roleValue = (role == null) ? "null" : role.getRole();
        System.out.println("roleValue = " + roleValue);

    }

    public void delete(Long userId) {
        Username username = usernameRepository.findByUserId(userId);
        Email email = emailRepository.findByUserId(userId);
        Password password = passwordRepository.findByUserId(userId);
        Role role = roleRepository.findByUserId(userId);

        // 1. Username 삭제
        usernameRepository.deleteById(username.getId());

        // 2. Email 삭제
        emailRepository.deleteById(email.getId());

        // 3. Password 삭제
        passwordRepository.deleteById(password.getId());

        // 4. Role 삭제
        roleRepository.deleteById(role.getId());

        // 5. User 삭제
        userRepository.deleteById(userId);

    }

    public static UserService getUserService() {
        return userService;
    }

    private UserService() {
    }
}
