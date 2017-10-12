package jkwar.code.abstractfactorypattern.sample02;


public class Q9Factory extends  CarFactory{
  public ITire createTire() {
    return new SUVTire();
  }

  public IEngine createEngine() {
    return new ImportEngine();
  }

  public IBrake createBrake() {
    return new SeniorBrake();
  }
}
