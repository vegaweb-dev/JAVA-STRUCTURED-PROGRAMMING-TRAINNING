package hashmaps.chall_03_server_log_analysis;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
Web Server Log Analysis
Scenario: A production web server generates raw logs containing HTTP error codes.
The DevOps team requires a summary of these occurrences to monitor system stability and detect potential anomalies.
Your task is to aggregate these status codes efficiently.
Challenge: Implement the countErrorLogs method using the imperative getOrDefault pattern to reinforce frequency map logic.
*/
public class ErrorCounter {

    Map<String, Integer> countErrorLogs(String[] rawLogOfErrors) {
        Map<String, Integer> mapOfErrors = new HashMap<String, Integer>();
        if (rawLogOfErrors == null || rawLogOfErrors.length == 0) {
            return Collections.emptyMap();
        }
        for (String error : rawLogOfErrors) {
            mapOfErrors.put(error, mapOfErrors.getOrDefault(error, 0) + 1);
        }
        return mapOfErrors;
    }

    public static void main(String[] args) {
        ErrorCounter errorCounter = new ErrorCounter();
        Map<String, Integer> resultingLogOfErrors = errorCounter.countErrorLogs(new String[]{"404", "500", "404", "403", "500", "404"});
        System.out.println("--Result of Grouping Errors --");
        System.out.println(resultingLogOfErrors);

    }
}
