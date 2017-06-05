public class Student {
  public static void main(String[] args) {
    Teacher proxy = new Proxy();

    System.out.println("I have Question 1");
    proxy.question1();

    System.out.println("I have Question 2");
    proxy.question2();

    System.out.println("I have Question 3");
    proxy.question3();
  }
}
