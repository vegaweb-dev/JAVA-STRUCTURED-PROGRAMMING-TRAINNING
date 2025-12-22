package hashmaps.chall_02_spare_parts_inventory_tally;
/*
The Spare Parts Inventory Tally
Scenario: An auto repair shop receives a large shipment box containing various spare parts.
To maintain an accurate inventory and prepare for the day's repairs, the head mechanic needs
a quick summary of how many units of each part (e.g., Spark Plugs, Filters, Cables) have arrived.

Challenge: Implement the countSpareParts method  to achieve the most concise and readable "one-liner" solution possible.
 */

import java.util.HashMap;
import java.util.Map;

public class InventoryService {

    Map<String, Integer> countSpareParts(String[] sparePartsArray) {
        Map<String, Integer> mapOfParts = new HashMap<String, Integer>();
        for (String part : sparePartsArray) {
            mapOfParts.put(part, mapOfParts.getOrDefault(part, 0) + 1);
        }
        return mapOfParts;
    }

    public static void main(String[] args) {
        InventoryService inventoryService = new InventoryService();
        Map<String, Integer> resultOfCount = inventoryService.countSpareParts(new String[]{"Spark Plug", "Filter", "Spark Plug", "Cable", "Spark Plug", "Filter"});
        System.out.println("---Result Count Of SpareParts Inventory---");
        System.out.println(resultOfCount);
    }
}
