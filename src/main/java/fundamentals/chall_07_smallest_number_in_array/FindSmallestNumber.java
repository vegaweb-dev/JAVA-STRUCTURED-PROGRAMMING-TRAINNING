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
