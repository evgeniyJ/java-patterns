package org.evgen.ua;

public class Launch {

  public static void main(String[] args) {
    OperatingSystem os = new Windows();
    //load os
    os.loadOS();
    //read file
    os.executeFile();
    //write in file
    os.setOperable(new Writer());
    os.executeFile();
  }
}
