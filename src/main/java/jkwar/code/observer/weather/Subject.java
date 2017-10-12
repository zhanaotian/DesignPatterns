package jkwar.code.observer.weather;

//抽象主题
public interface Subject {
  //添加观察者
  public void registerObserver(Observer observer);
  //删除观察者
  public void removeObserver(Observer observer);
  //更新观察者
  public void notifyObservers();
}
