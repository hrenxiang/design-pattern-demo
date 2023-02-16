package cn.huangrx.构建型模式.单例模式;

/**
 * 懒加载 - 线程安全
 */
public class SingletonLazySafe {
    private static SingletonLazySafe instance;
    public static synchronized SingletonLazySafe getInstance() {
        if (instance == null) {
            instance = new SingletonLazySafe();
        }
        return instance;
    }
}