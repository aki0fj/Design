import java.util.*;

public class SampleAbstractFactory{
  public static void main(String args[]){
    HotPot hotPot = new HotPot(new Pot());

    Factory factory = createFactory(args[0]);

    hotPot.addSoup(factory.getSoup());
    hotPot.addMain(factory.getProtein());
    hotPot.addVegetables(factory.getVegetables());
    hotPot.addOtherIngredients(factory.getOtherIngredients());
  }

  private static Factory createFactory(String type){
    if("Kimuchi".equals(type)){
      return new KimuchiFactory();
    }else if("Sukiyaki".equals(type)){
      return new SukiyakiFactory();
    }else{
      return new MizutakiFactory();
    }
  }
}
