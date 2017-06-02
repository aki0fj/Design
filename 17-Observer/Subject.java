import java.util.*;

public abstract class Subject{
  public List<Observer> observerList = new ArrayList<Observer>();

  public abstract void addObserver(Observer observer);
  public abstract void notifyObservers();
  public abstract void run(int count);
}
