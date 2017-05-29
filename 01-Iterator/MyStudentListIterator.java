public class MyStudentListIterator implements Iterator{
  private MyStudentList myStudentList;
  private int index;

  public MyStudentListIterator(MyStudentList list){
    this.myStudentList = list;
    this.index = 0;
  }

  public boolean hasNext(){
//    if(myStudentList.getLastNum() > index){
    if(myStudentList.students.size() > index){
      return true;
    } else {
      return false;
    }
  }

  public Student next(){
    Student stu = myStudentList.getStudentAt(index);
    index++;
    return stu;
  }
}
