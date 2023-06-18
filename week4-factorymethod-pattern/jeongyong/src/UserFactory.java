public abstract class UserFactory { // Creator
    public User newInstance() {
        User user = createUser();
        user.signup();
        return user;
    }
    protected abstract User createUser();
}
