Write a class called WordCounter that has a method called countWords which takes a String argument and returns the 
number of words in the string. For the purposes of this exercise, a word is defined as a sequence of non-space
characters.

Write unit tests using JUnit for the countWords method before implementing it. You should include test cases to cover 
the following scenarios:

- The input string is empty. The method should return 0.
- The input string contains a single word. The method should return 1.
- The input string contains multiple words separated by spaces. The method should return the correct number of words.
- The input string contains multiple words separated by multiple spaces. The method should treat consecutive spaces as 
a single separator and return the correct number of words. 

- Once you have written the tests, implement the countWords method to make the tests pass. Use a TDD approach, 
- writing only the code necessary to make each test pass before moving on to the next test.

Remember to follow the red-green-refactor cycle:

Write a failing test and run it.
Write the minimum amount of code to make the test pass.
Run the tests and ensure that they all pass.
Refactor the code as necessary to improve its design and maintainability, ensuring that all 
tests continue to pass.