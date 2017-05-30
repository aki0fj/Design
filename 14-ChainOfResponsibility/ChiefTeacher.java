public class ChiefTeacher extends Responsible{
  private Level responsibleLevel = new Level(3);

  public ChiefTeacher(String responsiblePerson){
    super(responsiblePerson);
  }

  protected boolean beAbleToJudge(Question question){
    if(question.level.lessThan(responsibleLevel)){
      return true;
    }
    return false;
  }

  protected void judge(Question question){
    if(question.content == "Is Banana one of snacks ?"){
      System.out.println(responsiblePerson + ": Banana isn't snacks");
    } else {
      putQuestion(question);
    }
  }
}
