package org.evgen.ua;

public class ConsoleOutputProcessor implements Processor {
    @Override
    public void process(Object obj) {
        System.out.println("Printing object " + obj);
    }
}
