import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;
        String mathematicalOperation;
        System.out.println("Type first number");
        Scanner firstTypedNumber = new Scanner(System.in);
        try {
            firstNumber = firstTypedNumber.nextDouble();
        } catch (Throwable error) {
            System.out.println("It's not a number!");
            return;
        }
        System.out.println("Type second number");
        Scanner secondTypedNumber = new Scanner(System.in);
        try {
            secondNumber = secondTypedNumber.nextDouble();
        } catch (Throwable error) {
            System.out.println("It's not a number!");
            return;
        }
        System.out.println("Type mathematics operation (+,-,*,/)");
        Scanner typedMathematicalOperation = new Scanner(System.in);
        mathematicalOperation = typedMathematicalOperation.nextLine();
        if (mathematicalOperation.equals("+") || mathematicalOperation.equals("-") || mathematicalOperation.equals("*") || mathematicalOperation.equals("/")) {
            double result = getaDouble(mathematicalOperation, firstNumber, secondNumber);
            System.out.println("Result is: "+ result);
        }
        else{
            System.out.println("I don't know this mathematics operation!");
        }

    }

    private static double getaDouble(String mathematicalOperation, double firstNumber, double secondNumber) {
        return switch (mathematicalOperation) {
            case "+" -> addition(firstNumber, secondNumber);
            case "-" -> subtraction(firstNumber, secondNumber);
            case "*" -> multiplication(firstNumber, secondNumber);
            default -> division(firstNumber, secondNumber);
        };
    }

    private static double addition(double firstNumber,double secondNumber){
        return firstNumber+secondNumber;
    }
    private static double subtraction(double firstNumber, double secondNumber){
        return firstNumber-secondNumber;
    }
    private  static double multiplication(double firstNumber, double secondNumber){
        return firstNumber*secondNumber;
    }
    private  static double division(double firstNumber,double secondNumber){
        return firstNumber/secondNumber;
    }

}