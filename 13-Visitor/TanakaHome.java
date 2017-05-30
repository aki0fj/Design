public class TanakaHome extends Home implements TeacherAcceptor{
  public Object praisedChild(){   //homeru
    System.out.println("Thank you!");
    return new Tea();
  }

  public Object reprovedChild(){  //hansei
    System.out.println("Oh! Unbelievable!");
    return null;
  }

  public void accept(Teacher teacher){
    teacher.visit(this);
  }
}
