public class ProxyUserName implements IUserName{
    private String userName;
    private RealUserName realUserName;
    private boolean isAdmin = false;
    public ProxyUserName(String userName) {
        this.userName = userName;
    }
    public ProxyUserName(String userName, boolean isAdmin) {
        this.userName = userName;
        this.isAdmin = isAdmin;
    }
    @Override
    public void sendUserNameToAmplify() {
        // 가상 프록시
        if (realUserName == null) {
            // 로깅 프록시
            System.out.println("::LOGGING : start to get user name from asyncStorage");
            realUserName = new RealUserName(userName);
        }
        // 보호 프록시
        if (isAdmin) realUserName.sendUserNameToAmplify();
        else System.out.println("!!CANNOT ACCESS");
    }
}
