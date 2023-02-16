package cn.huangrx.行为型模式.状态模式;

/**
 * 测试
 *
 * @author huangrx
 * @since 2023/2/16 18:48
 */
public class Test {
    public static void main(String[] args) {

        MarioStateMachine machine = new MarioStateMachine();
        //machine.meetMonster();

        machine.obtainCape();
        machine.meetMonster();

        System.out.println("分数为：" + machine.getScore() + ", 当前状态是：" + machine.getMarioStateEnum().name());


    }
}
