package hashsets.chall_01_duplicates_detector;
/*
Duplicate Detection
Scenario: A financial system is processing a batch of unique transaction IDs.
If a duplicate ID is found within the same batch, it could indicate a system glitch or a double-payment attempt.
Your task is to implement a high-performance validation utility to flag any batch containing repeated values.

Challenge: Implement the containsDuplicate method. You must use a HashSet<Integer> to track numbers as you iterate through the array.
If you attempt to add a number that is already present in the set, the method should immediately return true.
 */

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DuplicateDetector {
    public boolean containsDuplicate(int[] arrayOfTransactions) {
        if (arrayOfTransactions == null || arrayOfTransactions.length == 0) {
            return false;
        }
        Set<Integer> setOfTransactions = new HashSet<Integer>();
        for (Integer transaction : arrayOfTransactions) {
            if (!setOfTransactions.add(transaction)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DuplicateDetector duplicateDetector = new DuplicateDetector();
        boolean foundDuplicate = duplicateDetector.containsDuplicate(new int[]{101, 202, 101});
        System.out.println("---Result of Search---");
        System.out.println(foundDuplicate);
    }
}
