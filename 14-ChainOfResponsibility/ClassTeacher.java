public class ClassTeacher extends Responsible{
  private Level responsibleLevel = new Level(2);

  public ClassTeacher(String responsiblePerson){
    super(responsiblePerson);
  }

  protected boolean beAbleToJudge(Question question){
    if(question.level.lessThan(responsibleLevel)){
      return true;
    }
    return false;
  }

  protected void judge(Question question){
    if(question.content == "How much for snacks ?"){
      System.out.println(responsiblePerson + ": 300 yen");
    } else {
      putQuestion(question);
    }
  }
}
