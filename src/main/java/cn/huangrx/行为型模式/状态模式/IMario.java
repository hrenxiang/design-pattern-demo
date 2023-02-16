package cn.huangrx.行为型模式.状态模式;


/**
 * 马里奥接口类 --- 定义相应事件，事件触发状态转移
 *
 * @author   huangrx
 * @since   2023-02-16 17:05
 */
public interface IMario {
    
    /**
     * 碰到怪物
     * 
     * @author   huangrx
     * @since   2023-02-16 18:08
     */
    void meetMonster();


    /**
     * 获得蘑菇
     *
     * @author   huangrx
     * @since   2023-02-16 18:13
     */
    void obtainMushRoom();

    /**
     * 获得斗篷
     *
     * @author   huangrx
     * @since   2023-02-16 18:10
     */
    void obtainCape();


    /**
     * 获得火焰
     *
     * @author   huangrx
     * @since   2023-02-16 18:10
     */
    void obtainFire();

    
}
