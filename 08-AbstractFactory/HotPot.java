import java.util.*;
import java.util.Iterator.*;
 
public class HotPot{
  private Pot pot;
  private Soup soup;
  private Protein protein;
  private List vegetables;
  private List otherIngredients;

  public HotPot(Pot pot){
    this.pot = pot;
    System.out.println("set Pot");
  }
  public void addSoup(Soup soup){
    this.soup = soup;
    System.out.println(soup.name + " into Pot");
  }

  public void addMain(Protein protein){
    this.protein = protein;
    System.out.println(protein.name + " into Pot");
  }

  public void addVegetables(List<Vegetable> vegetables){
    this.vegetables = vegetables;
    Iterator itr = vegetables.iterator();
    while(itr.hasNext()){
      System.out.println(((Vegetable)itr.next()).name + " into Pot");
    }
  }

  public void addOtherIngredients(List<Ingredients> otherIngredients){
    this.otherIngredients = otherIngredients;
    Iterator itr = otherIngredients.iterator();
    while(itr.hasNext()){
      System.out.println(((Ingredients)itr.next()).name + " into Pot");
    }
  }
}
