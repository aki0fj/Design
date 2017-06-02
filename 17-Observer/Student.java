import java.util.*;
import java.util.Iterator.*;

public class Student extends Subject{
  public int runCount = 0;
  public String name = null;

  public Student(String name){
    this.name = name;
  }

  public void addObserver(Observer observer){
    observerList.add(observer);
  }

  public void notifyObservers(){
    Iterator itr = observerList.iterator();
    while(itr.hasNext()){
      ((Observer)itr.next()).update(this);
    }
  }

  public void run(int count){
    this.runCount = count;
    notifyObservers();
  }
}
