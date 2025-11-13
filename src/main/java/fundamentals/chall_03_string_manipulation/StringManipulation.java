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

    public String stringToUpper(String string) {
        return string.toUpperCase();
    }

    public String stringToLower(String string) {
        return string.toLowerCase();
    }

    public String generatesSubstring(String string) {
        return string.substring(4);
    }

}

class PrintResults {

    public static void printCount(int countResult) {
        System.out.println(countResult);
    }

    public static void printThirdValue(char thirdvalue) {
        System.out.println(thirdvalue);
    }

    public static void printStringInUpperCase(String string) {
        System.out.println(string);
    }

    public static void printStringToLower(String string) {
        System.out.println(string);
    }

    public static void printSubstring(String string) {
        System.out.println(string);
    }
}


public class StringManipulation {
    public static void main(String[] args) {
        StringContainer stringContainer = new StringContainer("java is awesome");
        String cadena = stringContainer.getString();
        StringComputing stringComputing = new StringComputing();
        int result = stringComputing.countCharacters(cadena);
        PrintResults printResults = new PrintResults();
        printResults.printCount(result);
        char thirdValue = stringComputing.findThirdCharacter(cadena);
        printResults.printThirdValue(thirdValue);
        String upperString = stringComputing.stringToUpper(cadena);
        printResults.printStringInUpperCase(upperString);
        String covertedToLowerString = stringComputing.stringToLower(cadena);
        printResults.printStringToLower(covertedToLowerString);
        String substringGenerated = stringComputing.generatesSubstring(cadena);
        printResults.printSubstring(substringGenerated);
    }
}
