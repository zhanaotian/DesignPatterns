package jkwar.code.singleton;

import java.io.ObjectStreamException;

/**
 * 静态内部类单例模式
 * 第一次加载Singleton类时并不会初始化sInstance,只有在第一次调用Singleton的getInstance方法才会导致sInstance被初始化
 * 能保证线程安全,也能保证单例对象的唯一性,同时也延迟了单例的实例化.
 */
public class StaticInnerClassesSingleton {
    public StaticInnerClassesSingleton() {
    }

    public static StaticInnerClassesSingleton getInstance(){
        return SingletonHolder.sInstance;
    }

    /**
     * 静态内部类
     */
    private static class SingletonHolder{
        private static final StaticInnerClassesSingleton sInstance=new StaticInnerClassesSingleton();
    }

    //杜绝反序化
    private Object readResolve() throws ObjectStreamException {
        return SingletonHolder.sInstance;
    }
}
