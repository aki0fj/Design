import java.util.List;

public class Main{
  public static void main(String args[]){
    Responsible nakagawa = new Student("nakagawa");
    Responsible rookie = new ClassTeacher("rookie");
    Responsible veteran = new ChiefTeacher("veteran");

    nakagawa.setNext(rookie).setNext(veteran);

    nakagawa.judge(new Question("How much for snacks ?", new Level(2)));
    nakagawa.judge(new Question("Is Banana one of snacks ?", new Level(3)));
    nakagawa.judge(new Question("Can I take mobile phone ?", new Level(4)));

  }
}
