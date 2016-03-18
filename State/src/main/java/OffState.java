
public class OffState implements State{

  private Lamp lamp;

  public OffState(Lamp lamp) {
    this.lamp = lamp;
  }

  public void off() {
    System.out.println("Lamp is off already!");
  }

  public void on() {
    System.out.println("Lamp is on!");
    lamp.setState(lamp.getOnState());
  }
}
