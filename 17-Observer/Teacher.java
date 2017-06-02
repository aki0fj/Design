public class Teacher implements Observer{
  public void update(Object obj){
    Student student = (Student)obj;
    System.out.println(student.name + " is run " + student.runCount + " times.");
  }
}
