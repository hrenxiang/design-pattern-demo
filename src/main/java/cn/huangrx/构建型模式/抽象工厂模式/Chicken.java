package cn.huangrx.构建型模式.抽象工厂模式;

/**
 * @author hrenxiang
 * @create 2023/2/15 17:56
 */
public class Chicken implements Animal {
    @Override
    public void shout() {
        System.out.println("鸡叫 - 咯咯哒");
    }
}
