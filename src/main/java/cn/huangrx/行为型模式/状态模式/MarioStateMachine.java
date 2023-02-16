package cn.huangrx.行为型模式.状态模式;

/**
 * 马里奥状态机 --- 用于记录当前状态和分数
 *
 * @author huangrx
 * @since 2023/2/16 18:17
 */
public class MarioStateMachine {
    private Integer score;
    private MarioStateEnum currentState;

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = MarioStateEnum.SMALL;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public MarioStateEnum getMarioStateEnum() {
        return currentState;
    }

    public void setMarioStateEnum(MarioStateEnum marioStateEnum) {
        this.currentState = marioStateEnum;
    }

    /**
     * 碰到怪物
     *
     * @author   huangrx
     * @since   2023-02-16 18:08
     */
    public void meetMonster() {
        this.createCurrentMario().meetMonster();
    };


    /**
     * 获得蘑菇
     *
     * @author   huangrx
     * @since   2023-02-16 18:13
     */
    public void obtainMushRoom() {
        this.createCurrentMario().obtainMushRoom();
    }

    /**
     * 获得斗篷
     *
     * @author   huangrx
     * @since   2023-02-16 18:10
     */
    public void obtainCape() {
        this.createCurrentMario().obtainCape();
    }


    /**
     * 获得火焰
     *
     * @author   huangrx
     * @since   2023-02-16 18:10
     */
    public void obtainFire() {
        this.createCurrentMario().obtainFire();
    }


    /**
     * 修改时只需要修改这里，这里如果需要减少 if的出现，可以用 策略模式，或者查表法来做。
     *
     * @author   huangrx
     * @since   2023-02-16 19:06
     */
    private IMario createCurrentMario() {
        if (MarioStateEnum.SMALL.name().equals(this.currentState.name())) {
            return new SmallMarioImpl(this);
        }
        if (MarioStateEnum.CAPE.name().equals(this.currentState.name())) {
            return new SmallCapeMarioImpl(this);
        }
        if (MarioStateEnum.FIRE.name().equals(this.currentState.name())) {
            return new SmallFireMarioImpl(this);
        }
        if (MarioStateEnum.SUPER.name().equals(this.currentState.name())) {
            return new SuperMarioImpl(this);
        } else {
            throw new IllegalArgumentException("不匹配");
        }
    }
}
