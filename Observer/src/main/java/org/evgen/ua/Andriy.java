package org.evgen.ua;

public class Andriy implements Observer{

  @Override
  public void update(Subject subject) {
    if(subject instanceof Repository){
      Repository repository = (Repository) subject;
      System.out.println("Source code updated. org.evgen.ua.Andriy received changes");
    }
  }
}
