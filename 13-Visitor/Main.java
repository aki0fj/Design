import java.util.List;

public class Main{
  public static void main(String args[]){
    List students = null;

    RookieTeacher rt = new RookieTeacher(students);

    rt.visit(new TanakaHome());

    rt.visit(new SuzukiHome());
  }
}
