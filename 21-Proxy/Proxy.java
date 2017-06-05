public class Proxy implements Teacher {
  private Teacher yamada = new Yamada();

  public void question1() {
    System.out.println("--- Answer 1 ---");
  }

  public void question2() {
    System.out.println("--- Answer 2 ---");
  }

  public void question3() {
    System.out.print("Answer is ...");
    yamada.question3();
  }
}
