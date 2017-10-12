package jkwar.code.factorypattern.sample02;

public class ClientTest {
  public static void main(String[] args) {
    //像这样有多个工厂的方式被称为多工厂模式，
    Factory factorya = new ConcreateFactoryA();
    Factory factoryb = new ConcreateFactoryB();
    Product pa = factorya.createProduct();
    Product pb = factoryb.createProduct();
    //反射获取类的实例，需要哪个类的对象就传入哪个类的类型即可
    Product pa1=factorya.createProduct(ConcreteProductB.class);
    pa.method();
    pa1.method();
    pb.method();
  }
}
