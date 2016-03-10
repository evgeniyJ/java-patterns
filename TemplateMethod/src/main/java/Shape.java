
public abstract class Shape {

  final void build() {
    init();
    draw();
    additionalComponents();
  }

  void init() {
    System.out.println("Init system");
  }

  abstract void draw();

  void additionalComponents() {
  }
}
