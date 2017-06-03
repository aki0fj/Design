public class StatePtternYumichan {
  private State state = null;

  public void changeState(State state) {
    this.state = state;
  }
  
  public String morningGreet() {
    return this.state.morningGreet();
  }

  public String getProtectionForCold() {
    return this.state.getProtectionForCold();
  }
}
