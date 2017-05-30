public class AlmondToppingIcecream implements Icecream{
  private String material = null;
  private Icecream ice = null;

  public AlmondToppingIcecream(Icecream ice){
    this.material = "Almond";
    this.ice = ice;
  }

  public String getMaterial(){
    return material + " " + ice.getMaterial();
  }

  public String getName(){
    return this.getMaterial() + " Icecream";
  }

  public String howSweet(){
    return "taste of " + this.getMaterial();
  }
}
