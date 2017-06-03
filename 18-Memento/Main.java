import java.util.HashMap;
import java.util.Map;

public class Main{
  private static Map<String, Calc.Memento> map = 
      new HashMap<String, Calc.Memento>();

  public static void main(String args[]){

    Calc calc = new Calc();
    for (int n=1; n<=5; n++) {
      calc.plus(n);
    }
    String keyword = "plus until 5";
    System.out.println(keyword + ": " + calc.getResult());
    map.put(keyword, calc.createMemento());
    
    Calc calc2 = new Calc();
    calc2.setMemento(map.get(keyword));
    for (int n=6; n<=10; n++) {
      calc2.plus(n);
    }

    keyword = "plus until 10";
    System.out.println(keyword + ": " + calc2.getResult());
    map.put(keyword, calc2.createMemento());
  }
}
