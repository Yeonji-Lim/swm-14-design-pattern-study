package org.example.service.oauth;

public class GoogleOAuthService extends OAuthService {
    @Override
    public String getAccessToken(String code) {
        return "google-access-token";
    }

    @Override
    public String getUserInfo(String accessToken) {
        return "google-user-info";
    }
}
