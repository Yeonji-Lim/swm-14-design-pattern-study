package org.example.service.oauth;

public class KakaoOAuthService extends OAuthService {
    @Override
    public String getAccessToken(String code) {
        return "kakao-access-token";
    }

    @Override
    public String getUserInfo(String accessToken) {
        return "kakao-user-info";
    }
}
