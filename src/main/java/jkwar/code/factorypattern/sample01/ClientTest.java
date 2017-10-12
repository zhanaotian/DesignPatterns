package jkwar.code.factorypattern.sample01;


public class ClientTest {
  public static void main(String[] args) {
    //构造一个制造汽车的工厂对象
    AudiFactory factory = new AudiCarFactory();

    //生产Q3并启动
    AudiCar audiQ3=factory.createAudiCar(AudiQ3.class);
    audiQ3.drive();
    audiQ3.selfNavigtion();
    audiQ3.horn();

    //生产Q5并启动
    AudiCar audiQ5=factory.createAudiCar(AudiQ3.class);
    audiQ5.drive();
    audiQ5.selfNavigtion();
    audiQ5.horn();

    //生产Q7并启动
    AudiCar audiQ7=factory.createAudiCar(AudiQ3.class);
    audiQ7.drive();
    audiQ7.selfNavigtion();
    audiQ7.horn();
  }
}
