package callable;

public class MyRunnable implements  Runnable {
    private UserInfo userInfo;

    public MyRunnable(UserInfo userInfo){
        this.userInfo =userInfo;
    }

    @Override
    public void run() {
        userInfo.setUsername("BarneyWong");
        userInfo.setPassword("123456");
    }
}
