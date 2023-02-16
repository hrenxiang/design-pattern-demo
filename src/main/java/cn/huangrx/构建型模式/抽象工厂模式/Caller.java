package cn.huangrx.构建型模式.抽象工厂模式;

/**
 * @author hrenxiang
 * @create 2023/2/15 19:16
 */
public class Caller {

    public static void main(String[] args) {
//        BaseFactory factory = new ChickenFactory();
        BaseFactory factory = new DuckFactory();
        Animal animal = factory.create();
        animal.shout();
    }
}
