import java.util.*;

public class Saito implements LoveMeditator{
  private Map<String, Colleague> colleagueMap = new HashMap<String, Colleague>();
  public void addColleague(Colleague colleague){
    colleagueMap.put(colleague.getName(), colleague);
  }

  public int consultation(Colleague colleagueInLove, Colleague secretLover){
    int possibility = 0;

    return possibility;
  }
}
