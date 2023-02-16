package cn.huangrx.构建型模式.抽象工厂模式;

/**
 * @author hrenxiang
 * @create 2023/2/15 19:10
 */
public class DuckFactory extends BaseFactory {
    @Override
    public Duck create() {
        return new Duck();
    }
}