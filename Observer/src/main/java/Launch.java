
public class Launch {

  public static void main(String[] args) {
    Observer evgen = new Evgen();
    Observer andriy = new Andriy();
    Repository repository = new Repository();
    //add observer evgen
    repository.addObserver(evgen);
    //change source code (evgen will be notified)
    repository.setSourceCode("Test");
    //add new observer
    repository.addObserver(andriy);
    //change again source code (evgen and andriy will be notified)
    repository.setSourceCode(repository.getSourceCode() + "Test");
    //remove evgen from observers
    repository.removeObserver(evgen);
    //change again source code (andriy will be notified)
    repository.setSourceCode(repository.getSourceCode() + "Test");
  }
}
