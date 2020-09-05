package org.helper;

import org.junit.Test;

public class StringGeneratorTest {

  @Test
  public void testGenerateString() {
    StringGenerator uuid = new StringGenerator(
        "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}");

    uuid.generateString(Scenario.VALID);
    uuid.generateString(Scenario.GREATER_LENGTH, 32);
    uuid.generateString(Scenario.SHORT_LENGTH);
    uuid.generateString(Scenario.EMPTY);
    uuid.generateString(Scenario.NULL);
    uuid.generateString(Scenario.SPECIAL_CHARACTER);
  }
}
