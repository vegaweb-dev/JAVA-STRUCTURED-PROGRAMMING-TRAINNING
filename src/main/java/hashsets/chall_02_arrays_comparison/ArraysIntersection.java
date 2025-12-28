package hashsets.chall_02_arrays_comparison;
import java.util.HashSet;
import java.util.Set;

/**
 * Provides utility methods for comparing integer arrays.
 *
 * <p>This class focuses on operations involving uniqueness
 * and intersection of array elements.</p>
 */
public class ArraysIntersection {
    /**
     * Counts the number of unique elements that are present in both input arrays.
     *
     * <p>This method removes duplicates from each array before performing
     * the comparison, ensuring that each common value is counted only once.</p>
     *
     * @param first  the first array of integers
     * @param second the second array of integers
     * @return the number of unique elements common to both arrays
     * @throws IllegalArgumentException if any of the input arrays is null
     */

    public int countCommonUniqueElements(int[] first, int[] second) {
        if (first == null || second == null) {
            throw new IllegalArgumentException("Input arrays must not be null");
        }

        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();

        for (int value : first) {
            firstSet.add(value);
        }

        for (int value : second) {
            secondSet.add(value);
        }

        int count = 0;
        for (int value : firstSet) {
            if (secondSet.contains(value)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        ArraysIntersection intersection = new ArraysIntersection();
        int result = intersection.countCommonUniqueElements(
                new int[]{1, 2, 3, 4},
                new int[]{0, 2, 4, 4, 5}
        );

        System.out.println(result);
    }
}
