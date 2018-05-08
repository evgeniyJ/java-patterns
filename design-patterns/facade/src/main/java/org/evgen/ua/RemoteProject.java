package org.evgen.ua;

public class RemoteProject implements GitRepository {

    public void add() {
        System.out.println("Added all changed files in test project");
    }

    public void commit() {
        System.out.println("Committed changes in test project");
    }

    public void push() {
        System.out.println("Pushed changes to remote repository of test project");
    }
}
