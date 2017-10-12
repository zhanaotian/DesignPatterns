package jkwar.code.singleton;

import java.io.ObjectStreamException;

/**
 * 懒汉式单例模式
 * 优点:在声明静态对象,并且在用户第一项调用getInstance时进行初始化,进行线程同步
 * 缺点:第一次加载时需要及时进行实例化,反应稍慢,最大的问题是每次调用getInstance都会进行同步,造成不必要的同步开销
 */
public class LazySingleton {
    private static LazySingleton instance;
    //构造函数私有
    public LazySingleton() {
    }
    //共有的静态函数 对外暴露获取单例对象的接口
    //synchronized 线程同步
    public static synchronized LazySingleton getInstance(){
        if (instance==null) {
            instance=new LazySingleton();
        }
        return instance;
    }

    //杜绝反序化
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
