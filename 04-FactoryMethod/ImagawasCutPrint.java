public class ImagawasCutPrint extends CutPrint{
  public void draw(Cuttable hanzai){
    System.out.println("draw manga");
  }
  public void cut(Cuttable hanzai){
    System.out.println("cut hanzai elegant with nife");
  }
  public void print(Cuttable hanzai){
    System.out.println("print with blood as ink");
  }

  protected Cuttable createCuttable(){
    return new Potato();
  }
}
