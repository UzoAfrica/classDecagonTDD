package calculatorAddition;

public class Calculator {
    public int calculate (int firstNumber, int secondNumber, String operator) {
        int result = 0;
        switch(operator){
            case "+":
                result= firstNumber + secondNumber;
                break;
            case "-":
                result= firstNumber - secondNumber;
                break;
            case "*":
                result= firstNumber * secondNumber;
                break;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }

        return result;
    }
}