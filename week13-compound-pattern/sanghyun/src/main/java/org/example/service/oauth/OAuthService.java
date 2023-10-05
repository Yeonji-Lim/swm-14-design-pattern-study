package org.example.service.oauth;

public abstract class OAuthService {

    public abstract String getAccessToken(String code);

    public abstract String getUserInfo(String accessToken);

    public String login(String code) {
        String accessToken = getAccessToken(code);
        String userInfo = getUserInfo(accessToken);
        return userInfo;
    }

}
