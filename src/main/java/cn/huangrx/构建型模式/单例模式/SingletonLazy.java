package cn.huangrx.构建型模式.单例模式;

/**
 * 懒加载-延迟加载版
 */
public class SingletonLazy {
    private static SingletonLazy instance;
    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}