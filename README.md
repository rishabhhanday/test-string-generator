# Test string generator
Generate test string based on scenario from regular expression

A Java library for generating test String that match a given regular expression for a given scenario.

# How to use it 

Here is the sample Java code demonstrating library usage:
```
    StringGenerator sg = new StringGenerator("[a-zA-Z0-9]{2,3}", 2, 3); //(regex,minLength,maxLength)
    
    sg.generateString(Scenario.VALID);              // a8s
    sg.generateString(Scenario.GREATER_LENGTH);     // s4cRH
    sg.generateString(Scenario.SHORT_LENGTH);       // a
    sg.generateString(Scenario.EMPTY);              // 
    sg.generateString(Scenario.NULL);               // null
    sg.generateString(Scenario.SPECIAL_CHARACTER);  // c8#
            
```
# Scenarios

1. Generate a valid string from regex.
2. Generate a string greater than max length.
3. Generate a string shorter than min length.
4. Generate a empty spaced string.
5. Generate a null string.
6. Generate a string with special character in it.

> Ref https://github.com/mifmif/Generex#:~:text=A%20Java%20library%20for%20generating%20String%20that%20match%20a%20given,dk%2F~amoeller%2Fautomaton%2F.
