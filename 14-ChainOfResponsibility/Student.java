public class Student extends Responsible{
  private Level responsibleLevel = new Level(1);

  public Student(String responsiblePerson){
    super(responsiblePerson);
  }

  protected boolean beAbleToJudge(Question question){
    if(question.level.lessThan(responsibleLevel)){
      return true;
    }
    return false;
  }

  protected void judge(Question question){
    System.out.println(responsiblePerson + ": " + question.content);
    putQuestion(question);
  }
}
