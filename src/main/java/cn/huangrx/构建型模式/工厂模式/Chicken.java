package cn.huangrx.构建型模式.工厂模式;

/**
 * @author hrenxiang
 * @create 2023/2/15 17:56
 */
public class Chicken extends Animal {
    @Override
    public void shout() {
        System.out.println("鸡叫 - 咯咯哒");
    }
}
