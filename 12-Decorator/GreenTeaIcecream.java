public class GreenTeaIcecream implements Icecream{
  private String material = null;

  public GreenTeaIcecream(){
    material = "GreenTea";
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
