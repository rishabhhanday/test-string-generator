# Test string generator
Generate test string based on scenario from regular expression

A Java library for generating test String that match a given regular expression for a given scenario.

# How to use it 

Here is the sample Java code demonstrating library usage:
```
    StringGenerator sg = new StringGenerator("[0-3]([a-c]|[e-g]{1,2})");
    
    sg.generateString(Scenario.VALID);              // 0fe
    sg.generateString(Scenario.GREATER_LENGTH, 3);  // 0feR
    sg.generateString(Scenario.SHORT_LENGTH);       // 0f
    sg.generateString(Scenario.EMPTY);              // 
    sg.generateString(Scenario.NULL);               // null
    sg.generateString(Scenario.SPECIAL_CHARACTER);  // 0f#
            
```
# Scenarios

1. Generate a valid string from regex.
2. Generate a null string.
3. Generate a string shorter than min length.
4. Generate a string with special character in it.
5. Generate a empty spaced string.
6. Generate a string greater than max length.
