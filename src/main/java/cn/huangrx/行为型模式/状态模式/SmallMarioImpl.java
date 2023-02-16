package cn.huangrx.行为型模式.状态模式;

/**
 * @author huangrx
 * @since 2023/2/16 18:13
 */
public class SmallMarioImpl implements IMario {

    private MarioStateMachine marioStateMachine;

    public SmallMarioImpl() {
    }

    public SmallMarioImpl(MarioStateMachine marioStateMachine) {
        this.marioStateMachine = marioStateMachine;
    }

    @Override
    public void meetMonster() {
        marioStateMachine.setScore(marioStateMachine.getScore() - 100);
        marioStateMachine.setMarioStateEnum(MarioStateEnum.DIE);
    }

    @Override
    public void obtainMushRoom() {
        marioStateMachine.setScore(marioStateMachine.getScore() + 100);
        marioStateMachine.setMarioStateEnum(MarioStateEnum.SUPER);
    }

    @Override
    public void obtainCape() {
        marioStateMachine.setScore(marioStateMachine.getScore() + 200);
        marioStateMachine.setMarioStateEnum(MarioStateEnum.CAPE);
    }

    @Override
    public void obtainFire() {
        marioStateMachine.setScore(marioStateMachine.getScore() + 300);
        marioStateMachine.setMarioStateEnum(MarioStateEnum.FIRE);
    }
}
