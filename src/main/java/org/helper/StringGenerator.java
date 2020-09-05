package org.helper;

import com.mifmif.common.regex.Generex;

public class StringGenerator {

  private final Generex generex;
  private int minLength;
  private int maxLength;

  public StringGenerator(String regex) {
    this.generex = new Generex(regex);
  }

  public StringGenerator(String regex, int minLength, int maxLength) {
    this.generex = new Generex(regex);
    this.minLength = minLength;
    this.maxLength = maxLength;
  }

  public String generateString(Scenario scenario) {
    try {
      switch (scenario) {
        case NULL:
          return null;
        case EMPTY:
          return "  ";
        case VALID:
          return generex.random();
        case SHORT_LENGTH:
          return minLength != maxLength ? generex.random(minLength, minLength).substring(1)
              : generex.random().substring(1);
        case SPECIAL_CHARACTER:
          return generex.random().substring(1).concat("#");
        case GREATER_LENGTH:
          return minLength != maxLength ? generex.random(maxLength).concat("RH")
              : generex.random().concat("RH");
        default:
          throw new StringGeneratorException("cannot found valid scenario");
      }
    } catch (Exception e) {
      throw new StringGeneratorException(e.getMessage());
    }
  }
}
