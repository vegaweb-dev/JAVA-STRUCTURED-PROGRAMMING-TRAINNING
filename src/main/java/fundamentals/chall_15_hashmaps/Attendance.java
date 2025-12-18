package fundamentals.chall_15_hashmaps;

import java.util.HashMap;
import java.util.Map;

/*
A teacher records who attended their class on different days.
String[] attendance = {"Ana", "Pedro", "Ana", "Lucia", "Pedro", "Ana"};
Your Mission
Write a method called countAttendances that receives this array and returns a map with each student’s name as the key and the total number of classes they attended as the value.
Specifications
Input:
String[] attendance
Output:
Map<String, Integer>
Description
Given a list of student names representing attendance across multiple days, process the array and calculate how many times each student appears. The result should clearly indicate how many classes each student attended.
 */

public class Attendance {

    Map<String, Integer> countAttendances(String[] attendance) {
        Map<String, Integer> attendanceMap = new HashMap<String, Integer>();
        for (String name : attendance) {
//            int count = attendanceMap.getOrDefault(name, 0);
            attendanceMap.put(name, attendanceMap.getOrDefault(name, 0) + 1);
        }
        return attendanceMap;
    }

    public static void main(String[] args) {
        Attendance attendance = new Attendance();
        Map<String, Integer> attendanceResult = attendance.countAttendances(new String[]{"Ana", "Pedro", "Ana", "Lucia", "Pedro", "Ana"});
        System.out.println(attendanceResult);
    }
}
