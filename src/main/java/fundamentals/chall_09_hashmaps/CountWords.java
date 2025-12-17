package fundamentals.chall_09_hashmaps;
/*Implement the following method: int countWord(String[] words, String target)
Clear Rules:
You must use a HashMap<String, Integer>.
Count how many times the target appears in the words array.
If the target does not exist, return 0.
Do not use streams.
Do not ignore case (use exact comparison).
*/

import java.util.HashMap;
import java.util.Map;

public class CountWords {
    Integer countWords(String[] words, String target) {
        Map<String, Integer> wordsMap = new HashMap<String, Integer>();
        for (String word : words) {
            Integer frequency = wordsMap.getOrDefault(word, 0);
            wordsMap.put(word, frequency + 1);
        }
        return wordsMap.getOrDefault(target,0);
    }

    public static void main(String[] args) {
        CountWords countWords = new CountWords();
        Integer response = countWords.countWords(new String[]{"class", "class", "clase"}, "class");
        System.out.println(response);
    }
}
