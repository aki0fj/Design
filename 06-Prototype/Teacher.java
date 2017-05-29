public class Teacher{
  public Paper[] createManyCrystals(){
    Paper prototype = new Paper("Snow Crystal");
    drawCrystal(prototype);   //take many time
    cutAccordanceWithLine(prototype);   //take many time

    Paper[] papers = new Paper[100];

    for(int n=0; n < papers.length; n++){
      papers[n] = (Paper)prototype.createClone();
    }
    return papers;
  }

  private void drawCrystal(Paper paper){
    // take many time
  }

  private void cutAccordanceWithLine(Paper paper){
    // take many time
  }
}
