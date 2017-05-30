public abstract class Responsible{
  private Responsible next = null;
  public String responsiblePerson = null;

  public Responsible(String responsiblePerson){
    this.responsiblePerson = responsiblePerson;
  }

  public Responsible setNext(Responsible next){
    this.next = next;
    return next;
  }

  public final void putQuestion(Question question){
    if(beAbleToJudge(question)){
      judge(question);
    }else if(next != null){
      next.putQuestion(question);
    }else{
      System.out.println("No one couldn't answer. Do it!");
    }
  }

  protected abstract boolean beAbleToJudge(Question question);
  protected abstract void judge(Question question);
}
