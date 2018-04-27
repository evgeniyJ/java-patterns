package org.evgen.ua;

public class OnState implements State{

  private Lamp lamp;

  public OnState(Lamp lamp) {
    this.lamp = lamp;
  }

  public void off() {
    System.out.println("org.evgen.ua.Lamp is off!");
    lamp.setState(lamp.getOffState());
  }

  public void on() {
    System.out.println("org.evgen.ua.Lamp is on already!");
  }
}
