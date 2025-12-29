package algorithms.chall_02_find_unique_value;

/**
 * Unique Values Greater Than Ten.
 * * <p>SCENARIO:
 * You are developing a module for a data analysis system.
 * The system receives a collection of integers representing sensor readings.
 * Your task is to filter these readings to identify specific "anomalies":
 * numbers that are strictly greater than 10 and appear exactly once in the entire dataset.</p>
 * * <p>REQUIREMENTS:
 * <ul>
 * <li>Immutability: Do not modify the original input array.</li>
 * <li>Constraint: Do not use Java Streams API.</li>
 * <li>Logic: Use loops and conditional logic.</li>
 * </ul>
 * </p>
 */

public class ValueFinder {

    /**
     * Finds the count of numbers that appear exactly once and are greater than 10.
     * * @param readings Array of integers to be analyzed.
     *
     * @return The number of unique elements greater than 10.
     * @throws IllegalArgumentException if the readings array is null.
     */
    public int countUniqueReadingsOverTen(int[] readings) {
        if (readings == null) {
            throw new IllegalArgumentException("Input array cannot be null.");
        }

        int totalUniqueOverTen = 0;

        for (int i = 0; i < readings.length; i++) {
            int currentReading = readings[i];

            if (currentReading > 10) {
                boolean isDuplicate = false;

                for (int j = 0; j < readings.length; j++) {
                    if (i != j && currentReading == readings[j]) {
                        isDuplicate = true;
                        break;
                    }
                }

                if (!isDuplicate) {
                    totalUniqueOverTen++;
                }
            }
        }

        return totalUniqueOverTen;
    }

    public static void main(String[] args) {
        ValueFinder analyzer = new ValueFinder();
        int[] data = {12, 5, 15, 12, 20, 15, 8, 45};
        int result = analyzer.countUniqueReadingsOverTen(data);
        System.out.println("Unique readings over ten: " + result);
    }
}