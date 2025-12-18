package fundamentals.chall_16_hashmaps;
/*
Implementa el método:
int countWord(String[] words, String target)
Reglas claras:
Debes usar HashMap<String, Integer>
Cuenta cuántas veces aparece target en el arreglo words
Si target no existe, retorna 0
No uses streams
No ignores mayúsculas/minúsculas (es comparación exacta)
Ejemplo esperado:
countWord(
    new String[]{"java", "python", "java", "c", "java"},
    "java"
)
// resultado: 3
 */

import java.util.HashMap;
import java.util.Map;

public class CountWord {
    int countWords(String[] words, String target) {
        Map<String, Integer> mapOfWords = new HashMap<String, Integer>();
        for (String word : words) {
            int frequency = mapOfWords.getOrDefault(word, 0);
            mapOfWords.put(word, frequency + 1);
        }
        return mapOfWords.getOrDefault(target,0);
    }


    public static void main(String[] args) {
        CountWord countWord = new CountWord();
        int resultOfFrequency = countWord.countWords(new String[]{"java", "python", "java", "c", "java"}, "java");
        System.out.println(resultOfFrequency);
    }
}
