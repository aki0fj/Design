public class Level{
  private int level;

  public Level(int level){
    this.level = level;
  }

  public boolean lessThan(Level lev){
    if(this.level <= lev.level){
      return true;
    }
    return false;
  }
}
