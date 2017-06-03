public class Calc {
  private int temp = 0;

  public void plus(int plus) {
    temp += plus;
  }

  public Memento createMemento() {
    return new Memento(temp);
  }

  public void setMemento(Memento memento) {
    this.temp = memento.result;
  }

  public int getResult() {
    return this.temp;
  }

  public class Memento {
    private int result = -1;

    Memento(int result) {
      this.result = result;
    }
  }
}
