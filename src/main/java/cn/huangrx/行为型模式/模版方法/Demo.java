package cn.huangrx.行为型模式.模版方法;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hrenxiang
 * @since 2022-10-26 14:01:23
 */
public class Demo {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n请选择你要玩的游戏.\n" +
                "1 - LeagueOfLegends\n" +
                "2 - PlayerUnknownBattlegrounds\n");
        int choice = Integer.parseInt(reader.readLine());
        System.out.println("\n\n");

        System.out.print("请输入你的姓名: ");
        String userName = reader.readLine();
        System.out.print("请输入您的密码: ");
        String password = reader.readLine();

        AbstractPlayGame abstractPlayGame = null;
        // 选择游戏
        if (choice == 1) {
            abstractPlayGame = new LeagueOfLegends(userName, password);
        } else if (choice == 2) {
            abstractPlayGame = new PlayerUnknownBattlegrounds(userName, password);
        }

        System.out.println("\n\n");
        // Enter the message.
        System.out.print("玩游戏时的消息: ");
        String message = reader.readLine();

        assert abstractPlayGame != null;
        abstractPlayGame.process(message);
    }
}