package fundamentals.chall_12_hashmaps;
/*
**Exercise 1: Entry Log**
A security system records who enters a building in a String array:
`String[] entries = {"Juan", "Maria", "Juan", "Pedro", "Maria", "Juan"};`
**Your mission:**
Create a method that returns a map with the person’s name and how many times they entered the building.
 */

import java.util.HashMap;
import java.util.Map;

public class CountEntries {
    Map<String, Integer> entryLog(String[] arrayOfVisitorNames) {
        Map<String, Integer> entryMap = new HashMap<String, Integer>();
        for (String name : arrayOfVisitorNames) {
            int counter = entryMap.getOrDefault(name, 0);
            entryMap.put(name, counter + 1);

        }
        return entryMap;
    }

    public static void main(String[] args) {
        CountEntries countEntries = new CountEntries();
        Map<String, Integer> entryReport = countEntries.entryLog(new String[]{"Juan", "Maria", "Juan", "Pedro", "Maria", "Juan"});
        System.out.println(entryReport);
    }
}
