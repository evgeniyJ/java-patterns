package org.evgen.ua;

public class OffState implements State{

  private Lamp lamp;

  public OffState(Lamp lamp) {
    this.lamp = lamp;
  }

  public void off() {
    System.out.println("org.evgen.ua.Lamp is off already!");
  }

  public void on() {
    System.out.println("org.evgen.ua.Lamp is on!");
    lamp.setState(lamp.getOnState());
  }
}
