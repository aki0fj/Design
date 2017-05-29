import java.util.*;

public class SukiyakiFactory extends Factory{
  public Soup getSoup(){
    return new WarishitaSoup();
  }

  public Protein getProtein(){
    return new Beef();
  }

  public List<Vegetable> getVegetables(){
    List<Vegetable> vegetables = new ArrayList<Vegetable>();
    vegetables.add(new ChineseCabbage());
    vegetables.add(new Leek());
    vegetables.add(new Chrysanthemum());
    return vegetables;
  }

  public List<Ingredients> getOtherIngredients(){
    List<Ingredients> otherIngredients = new ArrayList<Ingredients>();
    otherIngredients.add(new Tofu()); 
    otherIngredients.add(new Shirataki()); 
    return otherIngredients;
  }
}
