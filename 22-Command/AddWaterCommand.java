public class AddWaterCommand extends Command {

  public void excute() {
    System.out.println("Experiment add Water by 10g");

    while(!beaker.isMelted()) {
      beaker.addWater(10);
      beaker.mix();
    }

    beaker.note();
  }
}
