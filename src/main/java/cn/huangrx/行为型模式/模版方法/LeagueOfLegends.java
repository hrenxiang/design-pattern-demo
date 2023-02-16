package cn.huangrx.行为型模式.模版方法;

/**
 * 英雄联盟
 *
 * @author hrenxiang
 * @since 2022-10-26 13:50:04
 */
public class LeagueOfLegends extends AbstractPlayGame {

    public LeagueOfLegends(String userName, String password) {
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
        System.out.println("\n\nLogIn success on LeagueOfLegends");
        return true;
    }

    @Override
    boolean startPlay(String message) {
        System.out.println("LeagueOfLegends message：" + message);
        return true;
    }

    @Override
    public void logOut() {
        System.out.println("User: '" + userName + "' was logged out from LeagueOfLegends");
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