public abstract class OperatingSystem {

  protected Operable operable;

  public abstract void loadOS();

  public void executeFile(){
    operable.executeFile();
  }

  public void setOperable(Operable operable) {
    this.operable = operable;
  }
}
