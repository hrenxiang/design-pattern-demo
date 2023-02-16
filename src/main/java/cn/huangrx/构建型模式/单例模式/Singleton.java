package cn.huangrx.构建型模式.单例模式;

/**
 * 饿汉式
 *
 * @author hrenxiang
 * @create 2023/2/15 19:42
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    public Singleton() {}


    public Singleton getInstance() {
        return instance;
    }
}
