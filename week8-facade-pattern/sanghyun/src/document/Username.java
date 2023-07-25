package document;

public class Username {
    private Long id;
    private Long userId;
    private String username;

    public Username(String username, Long userId) {
        this.username = username;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static Username create(Long userId) {
        return new Username("default-username", userId);
    }
}
