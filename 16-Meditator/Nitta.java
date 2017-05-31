public class Nitta implements Colleague{
  private String name = "Nitta";
  private int tension;
  private Colleague secretLover = null;
  private LoveMeditator meditator = new Saito();

  public String getName(){
    return name;
  }

  public void setSecretLover(Colleague colleague){
    this.secretLover = colleague;
  }
  
  public void needsAdvice(){
    this.tension = meditator.consultation(this, secretLover);
    System.out.println(tension);
  }
}
