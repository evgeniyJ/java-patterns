package org.evgen.ua;

public class Lamp {

  private State state;

  private OnState onState;

  private OffState offState;

  public Lamp() {
    onState = new OnState(this);
    offState = new OffState(this);
    state = offState;
  }

  public void on() {
    state.on();
  }

  public void off() {
    state.off();
  }

  public void setState(State state) {
    this.state = state;
  }

  public OnState getOnState() {
    return onState;
  }

  public OffState getOffState() {
    return offState;
  }
}
