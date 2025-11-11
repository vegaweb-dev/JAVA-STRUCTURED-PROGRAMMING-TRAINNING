package fundamentals.EX01AddDouble;

    /* Declare three double-type variables named num1, num2, and result. Assign the value 5.5 to num1 and the value 2.2 to num2.
     Then, perform the sum of both and store the result in the result variable. Finally, print the value of result to the console.
     */


class Values {
    private double num1;
    private double num2;

    public Values(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }
}

class Calculator {
    public double result;
        /*public Calculator(double result){
            this.result = result;
        }*/

    public double addDoubles(double val1, double val2) {
        result = val1 + val2;
        return result;
    }
}

class PrintResult {
    private double valueToPrint;

    public PrintResult(double valueToPrint) {
        this.valueToPrint = valueToPrint;
    }

    public void printResult() {
        System.out.println(valueToPrint);
    }
}


public class AddDouble {

    public static void main(String[] args) {
        Values values = new Values(3.8, 3.2);
        double doubleNum1 = values.getNum1();
        double doubleNum2 = values.getNum2();
        Calculator calculator = new Calculator();
        calculator.addDoubles(doubleNum1, doubleNum2);
        PrintResult printResult = new PrintResult(calculator.result);
        printResult.printResult();
    }

}
