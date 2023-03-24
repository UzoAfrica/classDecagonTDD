package theoryExamples;

public class StringManipulator {
    public String reverseString(String sequence) {
        if (sequence.length() == 1) return sequence;

        StringBuilder builder = new StringBuilder(sequence);
        return builder.reverse().toString();
    }
}