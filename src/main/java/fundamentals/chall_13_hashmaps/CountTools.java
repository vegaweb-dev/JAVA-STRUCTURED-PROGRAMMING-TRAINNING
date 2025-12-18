package fundamentals.chall_13_hashmaps;
/*
A mechanic has a box with mixed tools:
String[] tools = {"Hammer", "Wrench", "Hammer", "Screwdriver", "Wrench", "Wrench"};
Your mission: Create the method countTools that returns a map with the tool name and its total quantity.
*/

import java.util.HashMap;
import java.util.Map;

public class CountTools {
    Map<String, Integer> countTools(String[] arrayOfTools) {
        Map<String, Integer> toolMap = new HashMap<String, Integer>();
        for (String tool : arrayOfTools) {
            int counter = toolMap.getOrDefault(tool, 0);
            toolMap.put(tool, counter + 1);
        }
        return toolMap;
    }

    public static void main(String[] args) {
        CountTools countTools = new CountTools();
        Map<String, Integer> toolsReport = countTools.countTools(new String[]{"Hammer", "Wrench", "Hammer", "Screwdriver", "Wrench", "Wrench"});
        System.out.println(toolsReport);
    }
}
