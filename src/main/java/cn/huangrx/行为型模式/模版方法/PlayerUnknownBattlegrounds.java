package cn.huangrx.行为型模式.模版方法;

/**
 * 绝地求生大逃杀
 *
 * @author hrenxiang
 * @since 2022-10-26 13:50:04
 */
public class PlayerUnknownBattlegrounds extends AbstractPlayGame {

    public PlayerUnknownBattlegrounds(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public boolean logIn(String userName, String password) {
        System.out.println("Name: " + this.userName);
        System.out.print("Password: ");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }
        // 模拟网络延迟，正在登录
        simulateNetworkLatency();
        System.out.println("\n\nLogIn success on PlayerUnknownBattlegrounds");
        return true;
    }

    /**
     * 违反里氏替换原则
     * 1、如果类的继承是为了代码复用，也就是共享方法，那么共享的父类方法就不应该改变，就是说不能被子类重新定义
     * 2、如果继承是为了多态，而多态的前提就是子类覆盖并重新定义父类的方法
     */
//    @Override
//    public boolean process(String message) {
//        System.out.println(123);
//        return true;
//    }

    @Override
    boolean startPlay(String message) {
        System.out.println("PlayerUnknownBattlegrounds message：" + message);
        return true;
    }

    @Override
    public void logOut() {
        System.out.println("User: '" + userName + "' was logged out from PlayerUnknownBattlegrounds");
    }

    private void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}