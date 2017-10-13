package org.zeroturnaround.demoapps.swing;

/**
 * Created by john on 13/10/2017.
 */
public class StringService {

  private int usageCount = 0;

  private static StringService instance;

  private StringService() {
    System.out.println("StringService created");
  }

  public static StringService getInstance() {
    if (instance == null) {
      instance = new StringService();
    }
    return instance;
  }

  public String duplicateString(String input) {
    System.out.println("-- duplicating string " + input);
    String out = String.format("%s-%s(%d)", input, input, usageCount);
    usageCount++;
    return out;

  }

}
