package cn.huangrx.构建型模式.单例模式;

/**
 * 懒汉式 - 双重检查 - 线程安全
 */
public class SingletonSafeDouble {
    
    private static SingletonSafeDouble instance = null;

    public static SingletonSafeDouble getInstance() {
        if (instance == null) {  // 一重
            synchronized (SingletonSafeDouble.class) {
                if (instance == null) { //二重
                    instance = new SingletonSafeDouble();
                }
            }
        }
        return instance;
    }
}