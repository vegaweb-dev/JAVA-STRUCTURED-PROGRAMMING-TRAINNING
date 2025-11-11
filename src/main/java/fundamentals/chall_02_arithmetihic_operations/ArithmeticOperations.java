package fundamentals.chall_02_arithmetihic_operations;
/*Declare two int variables named x and y. Assign the value 5 to x and the value 3 to y.
Then, perform and display in the console the result of the following operations:Sum of x and y
.Subtraction of x and $y$.Multiplication of x and y.
 */

class Values {
    private int x;
    private int y;

    public Values(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class Calculator {

    public int addNumbers(int number1, int number2) {
        return number1 + number2;
    }

    public int diffNumbers(int number1, int number2) {
        return number1 - number2;
    }

    public int productNumbers(int number1, int number2) {
        return number1 * number2;
    }
}

class Printvalues {

    public void printResults(int add, int subtrac, int prod) {
        System.out.println(add);
        System.out.println(subtrac);
        System.out.println(prod);
    }
}

public class ArithmeticOperations {
    public static void main(String[] args) {
        Values values = new Values(5, 3);

        Calculator calculator = new Calculator();
        int addition = calculator.addNumbers(values.getX(), values.getY());
        int subtraction = calculator.diffNumbers(values.getX(), values.getY());
        int product = calculator.productNumbers(values.getX(), values.getY());

        Printvalues printvalues = new Printvalues();
        printvalues.printResults(addition, subtraction, product);
    }
}
