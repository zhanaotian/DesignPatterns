package jkwar.code.observer.game;


public class Client {
  public static void main(String[] args) {
    //定义观察目标对象
    AllyControlCenterSubject subject=new ConcreteAllyControlCenter("金庸群侠");
    //定义四个观察者对象
    Observer player1,player2,player3,player4;
    player1=new Player("杨过");
    subject.join(player1);
    player2=new Player("郭靖");
    subject.join(player2);
    player3=new Player("黄蓉");
    subject.join(player3);
    player4=new Player("小龙女");
    subject.join(player4);
    //某成员遭受攻击
    player1.update(subject);
  }
}
