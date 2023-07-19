import document.User;
import document.Username;
import repository.*;
import service.UserService;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        UserService userService = UserService.getUserService();

        /** User 생성 **/
        Long savedUserId = userService.save(User.create());
        System.out.println();

        /** User 정보 **/
        userService.getUserInfo(savedUserId);
        System.out.println();

        /** User 삭제 **/
        userService.delete(savedUserId);
        System.out.println();

        /** User 정보 **/
        userService.getUserInfo(savedUserId);
        System.out.println();
    }
}