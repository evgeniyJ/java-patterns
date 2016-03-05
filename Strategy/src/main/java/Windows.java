
public class Windows extends OperatingSystem {

  public Windows(){
    operable = new Reader();
  }

  @Override
  public void loadOS() {
    System.out.println("Windows loaded");
  }
}
