package cn.huangrx.行为型模式.模版方法;

/**
 * Base class of play game.
 *
 * @author hrenxiang
 * @since 2022-10-26 13:43:31
 */
public abstract class AbstractPlayGame {
    String userName;
    String password;

    AbstractPlayGame() {
    }


    public boolean process(String message) {
        if (logIn(this.userName, this.password)) {

            boolean result = startPlay(message);
            logOut();
            return result;
        }
        return false;
    }

    /**
     * 登录游戏
     *
     * @param userName 用户名
     * @param password 密码
     * @return 是否登录成功
     */
    abstract boolean logIn(String userName, String password);

    /**
     * 玩游戏
     *
     * @param message 游戏中的消息
     * @return 玩好了没
     */
    abstract boolean startPlay(String message);

    /**
     * 退出游戏
     */
    abstract void logOut();
}