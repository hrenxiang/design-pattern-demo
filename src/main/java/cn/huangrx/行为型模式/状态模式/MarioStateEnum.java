package cn.huangrx.行为型模式.状态模式;

/**
 * 马里奥状态枚举
 *
 * @author huangrx
 * @since 2023/2/16 17:48
 */
public enum MarioStateEnum {

    /**
     * 普通马里奥
     * <p>
     * 普通马里奥 --- 碰到怪物 --- 死亡
     */
    SMALL(2),
    /**
     * 普通马里奥 --- 吃蘑菇 --- 超级马里奥（+100）
     * <p>
     * 超级马里奥 --- 碰到怪物 --- 普通马里奥 （-100） --- 碰到怪物 --- 死亡
     */
    SUPER(4),
    /**
     * 普通马里奥 --- 获得斗篷 --- 斗篷马里奥（+200）
     * 超级马里奥 --- 获得斗篷 --- 超级斗篷马里奥（+200）
     * <p>
     * 斗篷马里奥 --- 碰到怪物 --- 普通马里奥（-200）--- 碰到怪物 --- 死亡
     * 超级斗篷马里奥 --- 碰到怪物 --- 超级马里奥（-200） --- 碰到怪物 --- 普通马里奥（-100） --- 碰到怪物 --- 死亡
     */
    CAPE(6),
    /**
     * 普通马里奥 --- 获得火焰 --- 火焰马里奥（+300）
     * 超级马里奥 --- 获得火焰 --- 超级火焰马里奥（+300）
     * <p>
     * 火焰马里奥 --- 碰到怪物 --- 普通马里奥（-300）--- 碰到怪物 --- 死亡
     * 超级火焰马里奥 --- 碰到怪物 --- 火焰马里奥（-100） --- 碰到怪物 --- 死亡
     */
    FIRE(8),
    SUPER_CAPE(10),
    SUPER_FIRE(12),
    SUPER_CAPE_FIRE(14),
    SMALL_FIRE(16),
    SMALL_CAPE_FIRE(18),
    /**
     * 死亡
     */
    DIE(20);

    private final Integer value;

    MarioStateEnum(int value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public MarioStateEnum convert(Integer value) {
        if (null != value) {
            for (MarioStateEnum marioStateEnum : MarioStateEnum.values()) {
                if (marioStateEnum.getValue().equals(value)) {
                    return marioStateEnum;
                }
            }
        }
        return null;
    }
}
