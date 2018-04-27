package org.evgen.ua;

public class ElfFactory implements Barracks {

  @Override
  public Race createCreep(String type) {
    if (type.equals("range")) {
      return new RangeElf();
    } else {
      return new MeleeElf();
    }
  }
}
