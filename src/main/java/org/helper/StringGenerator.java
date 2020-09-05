package org.helper;

import com.mifmif.common.regex.Generex;

public class StringGenerator {

  private final Generex generex;

  public StringGenerator(String regex) {
    this.generex = new Generex(regex);
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
          return generex.random().substring(1);
        case SPECIAL_CHARACTER:
          return generex.random().substring(1).concat("#");
        default:
          if (scenario.equals(Scenario.GREATER_LENGTH)) {
            throw new StringGeneratorException("Use overloaded method for this scenario");
          }

          throw new StringGeneratorException("cannot found valid scenario");
      }
    } catch (Exception e) {
      throw new StringGeneratorException(e.getMessage());
    }
  }

  public String generateString(Scenario scenario, int length) {
    try {
      switch (scenario) {
        case NULL:
          return null;
        case EMPTY:
          return "  ";
        case VALID:
          return generex.random(length);
        case SHORT_LENGTH:
          return generex.random(length).substring(1);
        case SPECIAL_CHARACTER:
          return generex.random(length).substring(1).concat("#");
        case GREATER_LENGTH:
          return generex.random(length).concat("R");
        default:
          throw new StringGeneratorException("cannot found valid scenario");
      }
    } catch (Exception e) {
      throw new StringGeneratorException(e.getMessage());
    }
  }
}
