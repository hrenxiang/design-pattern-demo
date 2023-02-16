package cn.huangrx.行为型模式.状态模式;

/**
 * @author huangrx
 * @since 2023/2/16 18:13
 */
public class SmallFireMarioImpl implements IMario {

    private MarioStateMachine marioStateMachine;

    public SmallFireMarioImpl(MarioStateMachine marioStateMachine) {
        this.marioStateMachine = marioStateMachine;
    }

    @Override
    public void meetMonster() {
        marioStateMachine.setScore(marioStateMachine.getScore() - 300);
        marioStateMachine.setMarioStateEnum(MarioStateEnum.DIE);
    }

    @Override
    public void obtainMushRoom() {
        marioStateMachine.setScore(marioStateMachine.getScore() + 100);
        // 超级马里奥只加分不变化
        marioStateMachine.setMarioStateEnum(MarioStateEnum.SUPER_FIRE);
    }

    @Override
    public void obtainCape() {
        marioStateMachine.setScore(marioStateMachine.getScore() + 200);
        marioStateMachine.setMarioStateEnum(MarioStateEnum.SMALL_CAPE_FIRE);
    }

    @Override
    public void obtainFire() {
        marioStateMachine.setScore(marioStateMachine.getScore() + 300);
        // 只加分
    }
}
