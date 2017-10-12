package jkwar.code.observer.game;

import java.util.ArrayList;

//抽象主题
//战队控制中心类
abstract class AllyControlCenterSubject {
  protected String allyName;//战队名称
  //定义一个集合用于存储战队成员
  protected  ArrayList<Observer> players=new ArrayList<Observer>();

  public String getAllyName() {
    return allyName;
  }

  public void setAllyName(String allyName) {
    this.allyName = allyName;
  }

  //注册方法
  public void join(Observer o) {
    System.out.println(o.getName()+"加入"+this.allyName+"战队！");
    players.add(o);
  }

  //注销方法
  public void quit(Observer o) {
    System.out.println(o.getName()+"退出"+this.allyName+"战队！");
    players.remove(o);
  }

  //声明抽象通知方法
  public abstract void notifyObserver(String name);
}
