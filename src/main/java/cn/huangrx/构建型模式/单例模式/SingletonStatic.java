package cn.huangrx.构建型模式.单例模式;

/**
 * 静态内部类 - jvm 保证加载静态变量时线程安全 - jvm 保证调用 静态属性时，初始化相应的类，实现懒加载
 */
public class SingletonStatic {
    
    private static class SingletonHolder {
        public static SingletonStatic instance = new SingletonStatic();
    }
    
    public static SingletonStatic getInstance() {
        return SingletonHolder.instance;
    }
}