import java.util.ArrayList;
import java.util.List;

public class Repository implements Subject{

  private List<Observer> observers;
  private String sourceCode;

  public Repository(){
    observers = new ArrayList<>();
  }

  public void addObserver(Observer o) {
    observers.add(o);
  }

  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  public void notifyAllObservers() {
    observers.forEach(observer -> observer.update(this));
  }

  public String getSourceCode() {
    return sourceCode;
  }

  public void setSourceCode(String sourceCode) {
    this.sourceCode = sourceCode;
    notifyAllObservers();
  }
}
