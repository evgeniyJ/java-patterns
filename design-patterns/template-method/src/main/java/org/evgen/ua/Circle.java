package org.evgen.ua;

public class Circle extends Shape{

  @Override
  void draw() {
    System.out.println("Circle!");
  }

  @Override
  void additionalComponents() {
    System.out.println("Color red!");
  }
}
