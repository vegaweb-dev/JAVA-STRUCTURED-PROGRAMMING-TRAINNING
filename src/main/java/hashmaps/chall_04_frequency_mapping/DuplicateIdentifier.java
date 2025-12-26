package hashmaps.chall_04_frequency_mapping;

import java.util.HashMap;
import java.util.Map;

/**
 * <b>High-Efficiency Frequency Mapping: Duplicate Identification</b>
 *
 * <p><b>Scenario:</b>
 * In high-volume data processing, such as a real-time logistics tracking system,
 * identifying recurring patterns quickly is critical. The system must scan large
 * batches of shipment IDs to detect any item that appears more than once (duplicates).
 * Using traditional sorting might be too slow for massive datasets; therefore,
 * a high-speed hashing approach is required to flag these occurrences in a single pass.</p>
 *
 * <p><b>Challenge:</b>
 * Develop a high-performance function that:
 * <ul>
 *   <li>Maps the occurrence frequency of every element in an integer collection.</li>
 *   <li>Identifies and counts how many unique elements appear <b>more than once</b> (duplicates).</li>
 *   <li>Optimizes for <b>O(n) time complexity</b> to ensure scalability for enterprise-level data.</li>
 * </ul>
 * </p>
 */

public class DuplicateIdentifier {

    /**
     * Identifies and counts unique elements that appear more than once in the collection.
     *
     * <p>This implementation utilizes a {@code HashMap} to achieve <b>O(n) time complexity</b>,
     * as it requires a single pass to map frequencies and a subsequent scan of the map entries.</p>
     *
     * @param shipmentIds An array of integers representing item identifiers.
     * @return The total count of unique IDs that appear at twice in the collection.
     */

    public int countDuplicateIds(int[] shipmentIds) {
        if (shipmentIds == null || shipmentIds.length == 0) {
            return 0;
        }

        // Map to store frequency: Key = ID, Value = Count
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Single pass O(n) to populate frequencies
        for (int id : shipmentIds) {
            frequencyMap.put(id, frequencyMap.getOrDefault(id, 0) + 1);
        }

        int duplicateCount = 0;

        // Iterate through the map to count unique elements with frequency > 1
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicateCount++;
            }
        }

        return duplicateCount;
    }


    public static void main(String[] args) {
        DuplicateIdentifier identifier = new DuplicateIdentifier();
        int[] sampleData = {1, 2, 2, 2, 2, 2, 3, 4, 4, 4, 4, 4, 5, 67, 7, 8};
        int result = identifier.countDuplicateIds(sampleData);
        System.out.println("Total Unique Duplicates Found: " + result);
    }
}
