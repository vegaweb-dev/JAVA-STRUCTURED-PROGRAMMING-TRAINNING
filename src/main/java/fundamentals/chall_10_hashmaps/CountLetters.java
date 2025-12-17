package fundamentals.chall_10_hashmaps;
/*
You are given an array of strings.
Your task is to count how many times each string appears in the array and store the result in a map.
Requirements:
Use a Map<String, Integer> to store each string and its frequency.
If a string appears multiple times, increment its count.
Return the map containing all strings and their corresponding counts.
Input:
An array of strings letras.
Output:
A map where:
The key is the string.
The value is the number of times that string appears in the array.
Example:
Input:  ["A", "B", "B"]
Output: {"A"=1, "B"=2}
Constraints:
The array may contain duplicate values.
The array length is ≥ 1.
Strings are case-sensitive.
Function Signature:
Map<String, Integer> contarLetters(String[] letters)
*/

import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    Map<String, Integer> countStrings(String[] letters) {
        Map<String, Integer> mapfromarray = new HashMap<String, Integer>();
        for (String letter : letters) {
            Integer frequency = mapfromarray.getOrDefault(letter, 0);
            mapfromarray.put(letter, frequency + 1);
        }

        return mapfromarray;
    }

    public static void main(String[] args) {
        CountLetters maps1 = new CountLetters();
        Map<String, Integer> res = maps1.countStrings(new String[]{"A", "B", "B"});
        System.out.println(res);
    }

}
