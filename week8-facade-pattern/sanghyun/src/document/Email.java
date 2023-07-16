package document;

public class Email {
    private Long id;
    private Long userId;
    private String email;

    public Email(String email, Long userId) {
        this.email = email;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static Email create(Long userId) {
        return new Email("default-email", userId);
    }
}
