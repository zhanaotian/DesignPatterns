package jkwar.code.singleton;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

/**
 * 枚举单例
 * 优点：写法简单，枚举在java中与普通的类一样的，不仅能够有字段，还能有自己的方法，最重要的是默认枚举实例的创建是线程安全，并且在任何
 * 情况下它都是一个单例，因为其他的单例在一个情况下都会出现重新创建对象的情况，那就是反序列化。
 *
 */
public enum EnumerationSingleton {
    INSTANCE;

    public static EnumerationSingleton getInstance() {
        //增加这个方法是让别人明白怎么使用，因为这种实现方式
        //还比较少见，限于java 1.5之后的版本
        return INSTANCE;
    }
}
