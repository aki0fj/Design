public class AddSaltCommand extends Command {

  public void excute() {
    System.out.println("Experiment add Salt by 1g");

    while(beaker.isMelted()) {
      beaker.addSalt(1);
      beaker.mix();
    }

    beaker.note();
  }
}
