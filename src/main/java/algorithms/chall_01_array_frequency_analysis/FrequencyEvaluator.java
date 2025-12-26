package algorithms.chall_01_array_frequency_analysis;

import java.util.Arrays;

/**
 * <b>Array Frequency Analysis: Exact Pair Detection</b>
 *
 * <p><b>Scenario:</b>
 * You are developing a module for a logistics system that identifies specific patterns in shipment IDs.
 * The system needs to flag items that appear as exact duplicates (a frequency of exactly 2) within
 * a given batch to optimize storage allocation. Items appearing more or less than twice must be
 * ignored to maintain data integrity.</p>
 *
 * <p><b>Challenge:</b>
 * Create a robust function that processes a collection of integers. The function must:</p>
 * <ul>
 *   <li>Identify all unique elements that appear exactly twice in the collection.</li>
 *   <li>Count how many such pairs exist.</li>
 *   <li>Ensure the algorithm handles sorted data efficiently to minimize computational overhead.</li>
 * </ul>
 */
public class FrequencyEvaluator {
    /**
     * Provides analytical tools for data integrity checks within numerical collections.
     * This class focuses on identifying specific frequency patterns in integer arrays.
     *
     * <p>The algorithm sorts the input array to achieve an O(n log n) complexity,
     * then performs a linear scan to evaluate consecutive duplicates.</p>
     *
     * @param shipmentIds An array of integers representing item identifiers.
     * @return The total count of unique IDs that occur exactly twice in the collection.
     */

    public int countExactPairs(int[] shipmentIds) {
        if (shipmentIds == null || shipmentIds.length == 0) {
            return 0;
        }

        int totalExactPairs = 0;
        Arrays.sort(shipmentIds);

        for (int i = 0; i < shipmentIds.length; i++) {
            int currentFrequency = 1;
            int currentIdValue = shipmentIds[i];

            for (int j = i + 1; j < shipmentIds.length; j++) {
                if (shipmentIds[j] == currentIdValue) {
                    currentFrequency++;
                } else {
                    break;
                }
            }

            if (currentFrequency == 2) {
                totalExactPairs++;
            }

            // Skip processed elements to maintain efficiency
            while (i + 1 < shipmentIds.length && shipmentIds[i + 1] == currentIdValue) {
                i++;
            }
        }
        return totalExactPairs;
    }

    public static void main(String[] args) {
        FrequencyEvaluator evaluator = new FrequencyEvaluator();
        int[] sampleData = {7, 2, 2, 3, 3, 4, 4, 4, 4, 4, 5, 67, 7, 8};

        int result = evaluator.countExactPairs(sampleData);
        System.out.println("Total Exact Pairs Found: " + result);
    }
}
