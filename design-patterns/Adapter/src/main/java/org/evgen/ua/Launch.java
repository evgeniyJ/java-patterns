package org.evgen.ua;

public class Launch {

    public static void main(String[] args) {
        TV tv = new Samsung();
        Mechanism mechanism = new TVMechanism(tv);
        mechanism.enable();
        mechanism.disable();
    }
}
