public class VanillaIcecream implements Icecream{
  private String material = null;

  public VanillaIcecream(){
    material = "Vanilla";
  }

  public String getMaterial(){
    return material;
  }

  public String getName(){
    return material + " Icecream";
  }

  public String howSweet(){
    return "taste of " + material;
  }
}
