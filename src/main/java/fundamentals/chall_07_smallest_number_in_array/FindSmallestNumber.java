/*
Write a Java method named returnSmallest that accepts an integer array (int[] arr) as input and returns an integer.
The method must find and return the smallest numerical value (the minimum) contained within the array.
The method should assume the array is not empty and must correctly compare both positive and negative integers.
 */
package fundamentals.chall_07_smallest_number_in_array;

public class FindSmallestNumber {
    public int returnSmallest(int[] arr){
        int referenceNumber=arr[0];
        for(int i=1; i < arr.length;i++){
            if(arr[i]<referenceNumber){
                referenceNumber=arr[i];
            }
        }
        return referenceNumber;
    }

    public static void main(String[] args){
        FindSmallestNumber ex3 = new FindSmallestNumber();
        int result =ex3.returnSmallest(new int[]{2,3,-9,7});
        System.out.println(result);
    }
}
