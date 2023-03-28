package wordCounterExercise;

import calculatorAddition.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordCounterTest {

    @Test
    public void return0IfInputIsEmpty() {
        WordCounter wordCounter = new WordCounter();
        String input = "";
        int actualOutput = wordCounter.wordCount(input);
        assertEquals(0, actualOutput);
    }

    @Test
    public void return1IfInputContainSingleWord(){
        WordCounter wordCounter= new WordCounter();
        String input = "One";
        int actualOutput = wordCounter.wordCount(input);
        assertEquals(1, actualOutput);
    }
    @Test
    public void returnTheNumberOfWords(){
        WordCounter wordCounter= new WordCounter();
        String input = "One Two Three";
        int actualOutput = wordCounter.wordCount(input);
        assertEquals(3, actualOutput);
    }
    @Test
    public void returnTheNumberOfMultipleWords(){
        WordCounter wordCounter= new WordCounter();
        String input = "One Two Three, Four, Five";
        int actualOutput = wordCounter.wordCount(input);
        assertEquals(5, actualOutput);
    }
}
