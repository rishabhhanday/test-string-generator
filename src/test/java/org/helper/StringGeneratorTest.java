package org.helper;

import org.junit.Test;

public class StringGeneratorTest {

  @Test
  public void testGenerateString() {
    StringGenerator di = new StringGenerator(
        "[0-9a-zA-Z]{1,100}", 1, 100);

    StringGenerator uuid = new StringGenerator(
        "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}");

    System.out.println(uuid.generateString(Scenario.VALID));
    System.out.println(uuid.generateString(Scenario.GREATER_LENGTH));
    System.out.println(uuid.generateString(Scenario.SHORT_LENGTH));
    System.out.println(uuid.generateString(Scenario.EMPTY));
    System.out.println(uuid.generateString(Scenario.NULL));
    System.out.println(uuid.generateString(Scenario.SPECIAL_CHARACTER));

    System.out.println("--------------------------------");

    System.out.println(di.generateString(Scenario.VALID));
    System.out.println(di.generateString(Scenario.GREATER_LENGTH));
    System.out.println(di.generateString(Scenario.SHORT_LENGTH));
    System.out.println(di.generateString(Scenario.EMPTY));
    System.out.println(di.generateString(Scenario.NULL));
    System.out.println(di.generateString(Scenario.SPECIAL_CHARACTER));
  }
}
