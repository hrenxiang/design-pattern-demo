package cn.huangrx.构建型模式.抽象工厂模式;

/**
 * 抽象工厂
 *
 * @author hrenxiang
 * @create 2023/2/15 19:14
 */
public abstract class BaseFactory {
    /**
     * 创建动物
     * @return 动物
     */
    abstract Animal create();
}
