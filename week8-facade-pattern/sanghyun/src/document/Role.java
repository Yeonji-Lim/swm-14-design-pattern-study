package document;

public class Role {
    private Long id;
    private Long userId;
    private String role;

    public Role(String role, Long userId) {
        this.role = role;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public String getRole() {
        return role;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static Role create(Long userId) {
        return new Role("default-role", userId);
    }
}
