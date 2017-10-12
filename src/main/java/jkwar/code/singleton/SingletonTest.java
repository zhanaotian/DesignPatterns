package jkwar.code.singleton;


public class SingletonTest {
    public static void main(String[] args) {
        //饿汉式
        System.out.println(EagerSingleton.getSingleton());
        //懒汉式不加线程锁
        System.out.println(LazyNoThreadSingleton.getInstance());
        //懒汉式加线程锁
        System.out.println(LazySingleton.getInstance());
        //DCL(Double CheckLock)单例
        System.out.println(DCLSingleton.getInstance());
        // 静态内部类单例模式
        System.out.println(StaticInnerClassesSingleton.getInstance());
        //枚举单例
        System.out.println(EnumerationSingleton.getInstance());
    }
}
