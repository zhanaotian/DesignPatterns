package jkwar.code.singleton;

import java.io.ObjectStreamException;

/**
 * 饿汉式单例模式
 * 在声明静态对象式就初始化
 */
public class EagerSingleton {
    private static final EagerSingleton eagersingleton = new EagerSingleton();
    //构造函数私有
    public EagerSingleton() {
    }
    //共有的静态函数 对外暴露获取单例对象的接口
    public static EagerSingleton getSingleton(){
        return eagersingleton;
    }

    //杜绝反序化
    private Object readResolve() throws ObjectStreamException {
        return eagersingleton;
    }
}
