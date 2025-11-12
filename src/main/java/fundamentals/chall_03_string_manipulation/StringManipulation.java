package fundamentals.chall_03_string_manipulation;
/*
Create a program that receives the text string "Java is awesome" and performs the following tasks:

Print the number of characters in the string.

Print the third character of the string.

Convert the string to uppercase and print it.

Convert the string to lowercase and print it.

Print the substring "is awesome".
 */

class StringContainer {

    private String string;
    public StringContainer(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

}

class StringComputing {

    public int countCharacters(String string) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            counter += 1;
        }
        return counter;
    }

    public char findThirdCharacter(String string) {
        int reference = 2;
        char character = 'a';
        for (int i = 0; i < string.length(); i++) {
            if (i == reference) {
                character = string.charAt(i);
                break;
            }
        }
        return character;
    }

}

class PrintResults {

    public static void printCount(int countResult) {
        System.out.println(countResult);
    }

    public static void printThirdValue(char thirdvalue) {
        System.out.println(thirdvalue);
    }
}


public class StringManipulation {

    public static void main(String[] args) {
        StringContainer stringContainer = new StringContainer("java is awesome");
        StringComputing stringComputing = new StringComputing();
        String cadena = stringContainer.getString();
        int result = stringComputing.countCharacters(cadena);
        PrintResults printResults = new PrintResults();
        printResults.printCount(result);
        char thirdValue = stringComputing.findThirdCharacter(cadena);
        printResults.printThirdValue(thirdValue);
    }

}
