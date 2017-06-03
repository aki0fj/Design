public class Main{
  public static void main(String args[]){

    StatePtternYumichan yumi = new StatePtternYumichan();

    yumi.changeState(new OrdinaryState());
    System.out.println("Yumi greets ordinaly: " + yumi.morningGreet());
    System.out.println("Yumi protect for cold ordinaly: " + yumi.getProtectionForCold());

    yumi.changeState(new BadMoodState());
    System.out.println("Yumi greets in bad mood: " + yumi.morningGreet());
    System.out.println("Yumi protect for cold in bad mood: " + yumi.getProtectionForCold());

    yumi.changeState(new LovelyMoodState());
    System.out.println("Yumi greets in lovely mood: " + yumi.morningGreet());
    System.out.println("Yumi protect for cold in lovely mood: " + yumi.getProtectionForCold());
  }
}
