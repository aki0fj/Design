public class Ingredient implements Operand {
  private String operandString = null;

  public Ingredient(String operandString) {
    this.operandString = operandString;
  }

  public String getOperandString() {
    return operandString;
  }
}
