public class Main{
  public static void main(String args[]){
    Icecream ice = new VanillaIcecream();
    System.out.println(ice.getName());
    System.out.println(ice.howSweet());

    Icecream ice1 = new CashewNutsToppingIcecream(ice);
    System.out.println(ice1.getName());
    System.out.println(ice1.howSweet());

    Icecream ice2 = new AlmondToppingIcecream(ice1);
    System.out.println(ice2.getName());
    System.out.println(ice2.howSweet());

    Icecream ice3 = new CashewNutsToppingIcecream(new AlmondToppingIcecream(new GreenTeaIcecream()));
    System.out.println(ice3.getName());
    System.out.println(ice3.howSweet());
  }
}
