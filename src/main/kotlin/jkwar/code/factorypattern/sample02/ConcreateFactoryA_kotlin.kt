package jkwar.code.factorypattern.sample02


@Suppress("UNCHECKED_CAST")
class ConcreateFactoryA_kotlin : Factory_kotlin() {
  override fun createProduct(): Product_kotlin {
    return ConcreteProductA_kotlin();
  }

  override fun <T : Product_kotlin> createProduct(clz: Class<T>): T? {
    var p: Product? = null
    p = Class.forName(clz.name).newInstance() as Product?;
    return p as T?;
  }
}