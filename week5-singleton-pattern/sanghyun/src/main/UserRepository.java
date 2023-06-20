package main;

public class UserRepository {

    // 클래스가 메모리에 올라갈 때 static 수식자가 붙은 변수도 같이 메모리에 올라감.
    // 클래스가 메모리에 올라갈 때 새로운 객체(new UserRepository) 생성
    private static final UserRepository userRepository = new UserRepository();

    // 클래스가 메모리에 올라갈 때 생성한 1개의 UserRepository 반환함.
    public static UserRepository getInstance() {
        return userRepository;
    }

    // new 키워드를 이용한 객체 생성 제한
    private UserRepository() {
    }

    // UserRepository 객체에서 공용으로 사용가능한 변수
    private static int count = 0;

    public int getCount() {
        return count;
    }
    public void addCount() {
        count++;
    }
}