package org.zeroturnaround.demoapps.swing;

import java.util.Collection;
import java.util.Set;

/**
 * Created by john on 13/10/2017.
 */
public class StringServiceDependency {

  // Change Collection to Set in signature to break StringService.. how does autocompile react?
  public static void listMaker(Collection<String> c) {
    System.out.println("-- listMaker running .. ");
    c.add("alfa");
  }
}
