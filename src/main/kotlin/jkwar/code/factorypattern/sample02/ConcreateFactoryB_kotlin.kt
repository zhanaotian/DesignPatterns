package jkwar.code.factorypattern.sample02


class ConcreateFactoryB_kotlin :Factory_kotlin() {
  override fun createProduct(): Product_kotlin {
    return ConcreteProductB_kotlin()
  }

  override fun <T : Product_kotlin> createProduct(clz: Class<T>): T? {
   return null
  }
}