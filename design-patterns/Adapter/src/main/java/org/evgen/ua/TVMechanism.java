package org.evgen.ua;

public class TVMechanism implements Mechanism {

    private TV tv;

    public TVMechanism(TV tv) {
        this.tv = tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public void enable() {
        tv.energyOn();
        tv.setFirstChannel();
        tv.viewChannel();
    }

    public void disable() {
        tv.energyOff();
    }
}
