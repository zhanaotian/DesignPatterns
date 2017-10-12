package jkwar.code.singleton


class SingletonTest_kotlin {
}

fun main(args: Array<String>){
    //饿汉式
    println(EagerSingleton.getSingleton())
    //懒汉式不加线程锁
    println(LazyNoThreadSingleton.getInstance())
    //懒汉式加线程锁
    println(LazySingleton.getInstance())
    //DCL(Double CheckLock)单例
    println(DCLSingleton.getInstance())
    // 静态内部类单例模式
    println(StaticInnerClassesSingleton.getInstance())
    //枚举单例
    println(EnumerationSingleton.getInstance())
}