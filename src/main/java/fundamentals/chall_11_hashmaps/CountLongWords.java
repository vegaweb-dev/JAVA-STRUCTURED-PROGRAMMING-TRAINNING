/*
You are given an array of strings.
Your task is to count how many words have a length greater than 3 characters.
If a word appears multiple times and its length is greater than 3, each occurrence must be counted.
Requirements
Use a Map<String, Integer> to store words longer than 3 characters and their frequencies.
Only words with length greater than 3 should be stored.
Return the total count of all long-word occurrences.
Input
An array of strings arrayOfWords.
Output
An integer representing the total number of words whose length is greater than 3.
Example
Input:
["alfa", "brabo", "charlie", "al", "alabe"]
Output:
4
Explanation
"alfa" → valid
"brabo" → valid
"charlie" → valid
"al" → ignored (length ≤ 3)
"alabe" → valid
Total = 4
Constraints
The array length is ≥ 1.
Strings are case-sensitive.
The array may contain duplicate values.
Function Signature
int countLongWords(String[] arrayOfWords)
 */

package fundamentals.chall_11_hashmaps;

import java.util.HashMap;
import java.util.Map;

public class CountLongWords {

    int countLongWords(String[] arrayOfWords) {
        int count = 0;
        Map<String, Integer> mapOfWords = new HashMap<>();

        for (String word : arrayOfWords) {
            if (word.length() > 3) {
                Integer frequency = mapOfWords.getOrDefault(word, 0);
                mapOfWords.put(word, frequency + 1);
            }
        }

        for (int frequency : mapOfWords.values()) {
            count += frequency;
        }

        return count;
    }

    public static void main(String[] args) {
        CountLongWords maps2 = new CountLongWords();
        int res = maps2.countLongWords(
                new String[]{"alfa", "brabo", "charlie", "al", "alabe"}
        );
        System.out.println(res);
    }
}
