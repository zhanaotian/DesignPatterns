package jkwar.code.factorypattern.sample02;

public class ConcreateFactoryB extends Factory {
  public Product createProduct() {
    return new ConcreteProductB();
  }

  public <T extends Product> T createProduct(Class<T> clz) {
    return null;
  }
}
