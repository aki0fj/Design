import java.util.*;

public class KimuchiFactory extends Factory{
  public Soup getSoup(){
    return new KimuchiSoup();
  }

  public Protein getProtein(){
    return new Pork();
  }

  public List<Vegetable> getVegetables(){
    List<Vegetable> vegetables = new ArrayList<Vegetable>();
    vegetables.add(new Kimuchi());
    vegetables.add(new Leek());
    return vegetables;
  }

  public List<Ingredients> getOtherIngredients(){
    List<Ingredients> otherIngredients = new ArrayList<Ingredients>();
    otherIngredients.add(new Tofu()); 
    return otherIngredients;
  }
}
