package jkwar.code.observer.game;

//抽象观察者
public interface Observer {
  public String getName();
  public void setName(String name);
  public void help(); //声明支援盟友方法
  //声明响应方法
  public void update(AllyControlCenterSubject subject);
}
