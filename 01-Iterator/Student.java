public class Student{
  private String name;
  private int sex; //boy:1  girl:2
         
  public Student(String name,int sex){
    this.name = name;
    this.sex = sex;
  }
  public String getName(){
    return name;
  }
  public int getSex(){
    return sex;
  }
}

