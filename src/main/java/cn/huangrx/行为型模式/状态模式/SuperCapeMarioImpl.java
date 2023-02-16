package cn.huangrx.行为型模式.状态模式;

/**
 * @author huangrx
 * @since 2023/2/16 18:13
 */
public class SuperCapeMarioImpl implements IMario {

    private MarioStateMachine marioStateMachine;

    public SuperCapeMarioImpl(MarioStateMachine marioStateMachine) {
        this.marioStateMachine = marioStateMachine;
    }

    @Override
    public void meetMonster() {
        marioStateMachine.setScore(marioStateMachine.getScore() - 200);
        marioStateMachine.setMarioStateEnum(MarioStateEnum.SUPER);
    }

    @Override
    public void obtainMushRoom() {
        marioStateMachine.setScore(marioStateMachine.getScore() + 100);
        // 超级马里奥只加分不变化
    }

    @Override
    public void obtainCape() {
        marioStateMachine.setScore(marioStateMachine.getScore() + 200);
        // 已经获得了斗篷，只加分
    }

    @Override
    public void obtainFire() {
        marioStateMachine.setScore(marioStateMachine.getScore() + 300);
        marioStateMachine.setMarioStateEnum(MarioStateEnum.SUPER_CAPE_FIRE);
    }
}
