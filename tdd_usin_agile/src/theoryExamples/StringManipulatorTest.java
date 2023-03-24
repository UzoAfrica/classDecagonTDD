package theoryExamples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringManipulatorTest {

    @Test
    public void testNoReverseOneLetterString() {
        StringManipulator stringManipulator = new StringManipulator();

        String expected = "L";
        String result = stringManipulator.reverseString("L");

        assertEquals(expected, result);
    }

    @Test
    public void testNoReverseOneLetterKString() {
        StringManipulator stringManipulator = new StringManipulator();

        String expected = "K";
        String result = stringManipulator.reverseString("K");

        assertEquals(expected, result);
    }

    @Test
    public void testReverseStringABCtoCBA() {
        StringManipulator stringManipulator = new StringManipulator();

        String expected = "cba";
        String result = stringManipulator.reverseString("abc");

        assertEquals(expected, result);
    }

    @Test
    public void testReverseStringHELLOtoOLLEH() {
        StringManipulator stringManipulator = new StringManipulator();

        String expected = "OLLEH";
        String result = stringManipulator.reverseString("HELLO");

        assertEquals(expected, result);
    }

    @Test
    public void testReverseStringDOORtoROOD() {
        StringManipulator stringManipulator = new StringManipulator();

        String expected = "ROOD";
        String result = stringManipulator.reverseString("DOOR");

        assertEquals(expected, result);
    }
}