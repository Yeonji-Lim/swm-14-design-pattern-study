public class NaverUserFactory extends UserFactory { // Creator1
    @Override
    protected User createUser() {
        return new NaverUser();
    }
}
