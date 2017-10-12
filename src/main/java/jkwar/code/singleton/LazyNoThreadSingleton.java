package jkwar.code.singleton;

import java.io.ObjectStreamException;

/**
 * 懒汉式单例模式
 * 优点:在声明静态对象,并且在用户第一项调用getInstance时进行初始化
 * 缺点:第一次加载时需要及时进行实例化,反应稍慢，在多线程调用时会创建不同实例，不安全
 */
public class LazyNoThreadSingleton {
    private static LazyNoThreadSingleton instance;

    //构造函数私有
    public LazyNoThreadSingleton() {
    }

    //共有的静态函数 对外暴露获取单例对象的接口
    //synchronized 线程同步
    public static LazyNoThreadSingleton getInstance() {
        if (instance == null) {
            instance = new LazyNoThreadSingleton();
        }
        return instance;
    }

    //杜绝反序化
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
