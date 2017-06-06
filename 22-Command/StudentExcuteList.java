public class StudentExcuteList {
  public static void main(String[] args) {
    Command makeSaltWater = new MakeSaltWaterCommand();
    Command addSalt = new AddSaltCommand();
    ExcuteListCommand excuteList = new ExcuteListCommand();

    Beaker beaker = new Beaker(90, 10);

    makeSaltWater.setBeaker(beaker);
    addSalt.setBeaker(beaker);
    excuteList.setBeaker(beaker);

    excuteList.addCommand(makeSaltWater);
    excuteList.addCommand(addSalt);
    excuteList.excute();
  }
}
