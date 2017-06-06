import java.util.*;

public class ExcuteListCommand extends Command {
  private List<Command> commands = new LinkedList<Command>();

  public void excute() {
    Iterator<Command> itr = commands.iterator();

    Command command = null;

    System.out.println("Excute command list");
    while(itr.hasNext()) {
      command = itr.next();
      command.excute();
    }
    beaker.note();
  }

  public void addCommand(Command command) {
    commands.add(command);
  }
}
