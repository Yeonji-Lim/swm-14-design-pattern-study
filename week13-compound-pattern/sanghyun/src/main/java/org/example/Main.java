package org.example;

import org.example.service.oauth.OAuthService;
import org.example.service.oauth.OAuthServiceFactory;

public class Main {
    public static void main(String[] args) {

        OAuthServiceFactory oAuthServiceFactory = new OAuthServiceFactory();

        OAuthService kakaoOAuthService = oAuthServiceFactory.get("kakao");
        System.out.println("================ KAKAO ================");
        String kakaoUserInfo = kakaoOAuthService.login("code");
        System.out.println("kakaoUserInfo = " + kakaoUserInfo);

        System.out.println("================ GOOGLE ================");
        OAuthService googleOAuthService = oAuthServiceFactory.get("google");
        String googleUserInfo = googleOAuthService.login("code");
        System.out.println("googleUserInfo = " + googleUserInfo);

    }
}