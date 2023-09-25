public class RealUserName implements IUserName{
    private String userName;
    public RealUserName(String userName) {
        this.userName = userName;
    }
    @Override
    public void sendUserNameToAmplify() {
        System.out.println("!!send event : from [" + userName + "]");
    }
}
