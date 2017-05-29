import java.util.Vector;

public class MyStudentList extends NewStudentList implements Aggregate{
  public MyStudentList(){
    super();
  }

  public MyStudentList(int studentCount){
    super();
    this.students = new Vector<Student>(studentCount);
  }

  public Iterator iterator(){
    return new MyStudentListIterator(this);
  }
}
