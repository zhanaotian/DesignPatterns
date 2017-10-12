package jkwar.code.factorypattern.sample02;

public class ConcreateFactoryA extends Factory {

  public Product createProduct() {
    return new ConcreteProductA();
  }

  public <T extends Product> T createProduct(Class<T> clz) {
    Product p = null;
    try {
      p = (Product) Class.forName(clz.getName()).newInstance();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return (T) p;
  }
}
