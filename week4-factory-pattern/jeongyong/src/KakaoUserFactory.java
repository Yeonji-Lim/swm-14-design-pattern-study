public class KakaoUserFactory extends UserFactory { // Creator2
    @Override
    protected User createUser() {
        return new KakaoUser();
    }
}
