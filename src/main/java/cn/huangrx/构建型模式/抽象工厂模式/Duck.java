package cn.huangrx.构建型模式.抽象工厂模式;

/**
 * @author hrenxiang
 * @create 2023/2/15 17:57
 */
public class Duck implements Animal {

    @Override
    public void shout() {
        System.out.println("鸭叫 - 嘎嘎嘎");
    }
}
