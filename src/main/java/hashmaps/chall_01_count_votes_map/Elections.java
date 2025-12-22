package hashmaps.chall_01_count_votes_map;
/*The Electronic Voting System.
Scenario: A local community is holding an election. The voting machines generate a raw list of candidate names.
The electoral council needs a backend service to aggregate these results and provide a final tally.
Challenge: Implement a highly efficient counting logic using the HashMaps.
*/

import java.util.HashMap;
import java.util.Map;

public class Elections {
    Map<String, Integer> countVotes(String[] votes) {
        Map<String, Integer> mapOfVotes = new HashMap<String, Integer>();
        for (String vote : votes) {
            mapOfVotes.put(vote, mapOfVotes.getOrDefault(vote, 0) + 1);
        }
        return mapOfVotes;
    }

    public static void main(String[] args) {
        Elections elections = new Elections();
        Map<String, Integer> resultOfCount = elections.countVotes(new String[]{"red Party", "blue party", "democrat party", "red party", "blue party", "blue party"});
        System.out.println("--- Election Results ---");
        System.out.println(resultOfCount);
    }
}