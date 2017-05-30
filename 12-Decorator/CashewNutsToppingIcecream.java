public class CashewNutsToppingIcecream implements Icecream{
  private String material = null;
  private Icecream ice = null;

  public CashewNutsToppingIcecream(Icecream ice){
    this.material = "CashewNuts";
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
