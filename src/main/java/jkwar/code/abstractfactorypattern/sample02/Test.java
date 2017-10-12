package jkwar.code.abstractfactorypattern.sample02;


public class Test {
  public static void main(String[] args) {
    //构造一个生产q3的工厂
    CarFactory q3=new Q3Factory();
    q3.createTire().tire();
    q3.createEngine().Engine();
    q3.createBrake().brake();

    CarFactory q9=new Q9Factory();
    q9.createTire().tire();
    q9.createEngine().Engine();
    q9.createBrake().brake();
  }
}
