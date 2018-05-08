package org.evgen.ua;

public class GitFacade {

    private GitRepository gitRepository;

    public GitFacade(GitRepository gitRepository){
        this.gitRepository = gitRepository;
    }

    public void setGitRepository(GitRepository gitRepository) {
        this.gitRepository = gitRepository;
    }

    public void pushOnLocalRepository(){
        gitRepository.add();
        gitRepository.commit();
        gitRepository.push();
    }
}
