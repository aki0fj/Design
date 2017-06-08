public class Main{
  public static void main(String args[]){
    Operand o1 = new Ingredient("Feeze dried ingredients");
    Operand o2 = new Ingredient("Noodles");
    Operator ope = new Plus(o1, o2);

    o1 = ope.excute();
    System.out.println(o1.getOperandString());
    
    o2 = new Ingredient("Boiling water");

    ope = new Plus(o1, o2);

    o1 = ope.excute();
    System.out.println(o1.getOperandString());

    ope = new Wait(3, o1);

    o1 = ope.excute();
    System.out.println(o1.getOperandString());
    
    o2 = new Ingredient("Liquid soup");

    ope = new Plus(o1, o2);

    o1 = ope.excute();
    System.out.println(o1.getOperandString());
  }
}
