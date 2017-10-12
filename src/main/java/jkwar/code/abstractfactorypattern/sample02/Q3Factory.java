package jkwar.code.abstractfactorypattern.sample02;


public class Q3Factory extends  CarFactory{
  public ITire createTire() {
    return new NormlTire();
  }

  public IEngine createEngine() {
    return new DomesticeEngine();
  }

  public IBrake createBrake() {
    return new NormalBrake();
  }
}
