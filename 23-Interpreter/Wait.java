public class Wait implements Operator {
  private int minute = -1;
  private Operand operand = null;

  public Wait(int minute, Operand operand) {
    this.minute = minute;
    this.operand = operand;
  }

  public Operand excute() {
    return new Ingredient(operand.getOperandString() + " left for " + minute + " minutes");
  }
}
