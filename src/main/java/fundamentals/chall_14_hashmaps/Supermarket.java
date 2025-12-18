package fundamentals.chall_14_hashmaps;
/*
The delivery truck has dropped off a list of all the fruits included in the shipment. We need to process this list to know exactly how many units of each fruit we have for inventory purposes.
Your mission: Write a class called Supermarket that contains the method countFruits.
Specifications:
Input: String[] shipment
Output: Map<String, Integer>
 */

import java.util.HashMap;
import java.util.Map;

public class Supermarket {

    Map<String, Integer> countFruits(String[] shipment) {
        Map<String, Integer> fruitsMap = new HashMap<String, Integer>();
        for (String fruit : shipment) {
            int count = fruitsMap.getOrDefault(fruit, 0);
            fruitsMap.put(fruit, count + 1);
        }
        return fruitsMap;
    }

    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();
        Map<String, Integer> mapResult = supermarket.countFruits(new String[]{"Manzana", "Pera", "Manzana", "Banana", "Pera", "Manzana", "Uva", "Banana", "Uva", "Manzana"});
        System.out.println(mapResult);
    }

}



