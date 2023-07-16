package document;

public class Password {
    private Long id;
    private Long userId;
    private String password;

    public Password(String password, Long userId) {
        this.password = password;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static Password create(Long userId) {
        return new Password("default-password", userId);
    }
}
