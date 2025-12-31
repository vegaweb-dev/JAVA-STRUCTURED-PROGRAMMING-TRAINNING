package algorithms.chall_03_strict_frequency_counter;

/**
 * <h2>Strict Frequency Analysis</h2>
 * * <p><b>Scenario:</b> In data processing systems, it is often necessary to identify
 * elements that meet a specific distribution pattern. We are dealing with an input
 * dataset where elements may appear multiple times.</p>
 * * <p><b>Challenge:</b> Implement a high-precision evaluator that traverses an
 * integer array and determines the total number of elements that satisfy an
 * <b>exact frequency constraint</b> (e.g., appear exactly N number of times),
 * ensuring that neither under-represented nor over-represented data is included
 * in the final count.</p>
 * * <p><b>Implementation Details:</b> This evaluator identifies elements that satisfy
 * a strict occurrence constraint, ensuring data integrity by treating the input
 * as immutable.</p>
 * * <p><b>Constraints:</b>
 * <ul>
 * <li>The original input array must remain immutable (No side effects).</li>
 * <li>Time Complexity: O(n²)</li>
 * <li>Space Complexity: O(n)</li>
 * </ul>
 * </p>
 */
public class DuplicateCounter {

    /**
     * Determines the total count of distinct elements that appear with an exact frequency.
     * * <p>This implementation uses an auxiliary marker array to track processed elements,
     * preventing double-counting and maintaining the O(n²) time complexity.</p>
     * * @param numbers         the source array to analyze. Must not be null or empty.
     *
     * @param targetFrequency the exact number of occurrences required to be counted.
     * @return the number of distinct elements matching the specified frequency.
     * @throws IllegalArgumentException if the input array is null or empty.
     */
    public int countByExactFrequency(int[] numbers, int targetFrequency) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Input dataset cannot be null or empty.");
        }

        final boolean[] isAlreadyProcessed = new boolean[numbers.length];
        int matchingElementsCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (isAlreadyProcessed[i]) {
                continue;
            }

            int occurrenceCount = 1;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]) {
                    occurrenceCount++;
                    isAlreadyProcessed[j] = true;
                }
            }

            if (occurrenceCount == targetFrequency) {
                matchingElementsCount++;
            }
        }

        return matchingElementsCount;
    }

    public static void main(final String[] args) {
        DuplicateCounter evaluator = new DuplicateCounter();
        int result = evaluator.countByExactFrequency(new int[]{1, 2, 2, 3, 4, 5, 5, 6, 7,3}, 2);
        System.out.println(result);
    }
}