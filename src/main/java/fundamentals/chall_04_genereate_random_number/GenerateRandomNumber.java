package fundamentals.chall_04_genereate_random_number;
/*
Create a method called 'generarNumeroAleatorio' (generateRandomNumber) that accepts two integers,
'a' and 'b', and returns a random number within the range [a, b] (including both 'a' and 'b').
Example input:
int randomNumber = generarNumeroAleatorio(1, 10);
Expected Output:
A random number between 1 and 10 (both inclusive).
Constraints:
Use Math.random().
'a' will always be less than or equal to 'b'.
*/

class ValuesContainer{
    private int a;
    private int b;

    public ValuesContainer(int a, int b){
        this.a=a;
        this.b=b;
    }

    public int getA(){
        return a;
    }
    public  int getB(){
        return b;
    }
}

class GenerateRandomCalculator{
    public double genRandom(int a, int b){
         return a + Math.floor(Math.random()*(b-a+1));
    }
}

class PrintResult{
    public void printResult(double result){
        System.out.println(result);
    }
}

public class GenerateRandomNumber {
    public static void main(String[] args){
        ValuesContainer valuesContainer = new ValuesContainer(2,5);
        int a =valuesContainer.getA();
        int b =valuesContainer.getB();
        GenerateRandomCalculator generateRandomCalculator = new GenerateRandomCalculator();
        double randomNumber =  generateRandomCalculator.genRandom(a,b);
        PrintResult printResult = new PrintResult();
        printResult.printResult(randomNumber);
    }
}
