package org.evgen.ua;

public class OrcFactory implements Barracks {

  @Override
  public Race createCreep(String type) {
    if (type.equals("range")) {
      return new RangeOrc();
    } else {
      return new MeleeOrc();
    }
  }
}
