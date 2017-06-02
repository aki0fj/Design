public class Main{
  public static void main(String args[]){

    Teacher roukie = new Teacher();

    Student aki = new Student("Aki");
    System.out.println("Student's name is " + aki.name);

    aki.addObserver(roukie);

    aki.run(19);
  }
}
