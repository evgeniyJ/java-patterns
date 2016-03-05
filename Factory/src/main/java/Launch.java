
public class Launch {

  public static void main(String[] args) {
    Barracks barracks1 = new OrcFactory();
    Barracks barracks2 = new ElfFactory();
    System.out.println(barracks1.createCreep("range"));
    System.out.println(barracks2.createCreep("melee"));
  }
}
