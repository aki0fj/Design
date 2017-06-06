public class MakeSaltWaterCommand extends Command {

  public void excute() {
    System.out.println("Experiment make salt water");

    beaker.mix();
    beaker.note();
  }
}
