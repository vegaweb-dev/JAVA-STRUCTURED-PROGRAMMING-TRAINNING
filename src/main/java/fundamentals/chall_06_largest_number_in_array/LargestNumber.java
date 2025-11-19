package fundamentals.chall_06_largest_number_in_array;

public class LargestNumber {
    int largestNum(int[] arr){
        int ref=arr[0];

        for(int i=0; i<arr.length;i++){

            if(arr[i]>ref){
                ref=arr[i];
            }

        }
        System.out.println(ref);
        return ref;

    }

    public static void main(String[] args){
        LargestNumber ex2 = new LargestNumber();
        ex2.largestNum(new int[]{1,-5,-4,3} );
    }

}
