package org.evgen.ua;

public class ThreadWorker {

    private Command command;

    public ThreadWorker(Command command){
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void run(){
        command.execute();
    }
}
