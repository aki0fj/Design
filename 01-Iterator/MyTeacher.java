public class MyTeacher extends Teacher{
//  private StudentList studentList;
  private MyStudentList studentList;

  public void createStudentList(){
//    studentList = new StudentList(5);
    studentList = new MyStudentList(5);
    studentList.add(new Student("Akai Ryota", 1));
    studentList.add(new Student("Akabane Satomi", 2));
    studentList.add(new Student("Okada Mio", 2));
    studentList.add(new Student("Nishimori Shunsuke", 1));
    studentList.add(new Student("Nakanomori Rena", 2));
  }

  public void callStudents(){
//    int size = studentList.getLastNum();
//    for(int n=0; n<size ; n++){
//      System.out.println(studentList.getStudentAt(n).getName());
    Iterator itr = studentList.iterator();
    while(itr.hasNext()){
      System.out.println(((Student)itr.next()).getName());
    }
  }
}
