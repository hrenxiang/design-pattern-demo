package cn.huangrx.构建型模式.抽象工厂模式;

/**
 * @author hrenxiang
 * @create 2023/2/15 19:10
 */
public class ChickenFactory extends BaseFactory {
    @Override
    public Chicken create() {
        return new Chicken();
    }
}
