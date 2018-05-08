package org.evgen.ua;

public class Launch {

    public static void main(String[] args) {
        GitRepository gitRepository = new RemoteProject();
        GitFacade gitFacade = new GitFacade(gitRepository);
        gitFacade.pushOnLocalRepository();
    }
}
