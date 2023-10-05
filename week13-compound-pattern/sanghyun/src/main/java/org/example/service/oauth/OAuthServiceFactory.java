package org.example.service.oauth;

public class OAuthServiceFactory {

    private KakaoOAuthService oauthKakaoService = new KakaoOAuthService();
    private GoogleOAuthService oAuthGoogleService = new GoogleOAuthService();

    public OAuthService get(String registration) {
        switch (registration) {
            case "kakao":
                return oauthKakaoService;
            case "google":
                return oAuthGoogleService;
            case "apple":
                return null;
            default:
                return null;
        }
    }
}
