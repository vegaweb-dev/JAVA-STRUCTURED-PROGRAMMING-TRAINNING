/*
Implement the method:
int analyze(int[] arr)
Rules
If the array is null or empty, return 0.
Calculate the total sum of the elements.
Obtain the average of the elements.
Iterate through the array starting from index 2, advancing by 2 at a time (i.e., i = 2, 4, 6, 8, ...).
Count how many elements simultaneously meet all the following conditions:
They are negative (< 0).
They are less than the calculated average.
They are multiples of 9 (% 9 == 0).
Their absolute value is greater than 50 ( |element| > 50).
Return Value
The method must return: The total count of elements that satisfy all the conditions.
 */

package fundamentals.chall_08_filter_array;

class ArrayContainer {
    private int[] array;

    ArrayContainer(int[] array) {
        this.array = array;
    }

    int[] getArray() {
        return array;
    }
}

class Filter {

    int filterValues(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int acc = 0;
        double average = 0;
        int count = 0;

        for (int el : array) {
            acc += el;
        }

        average = (double) acc / array.length;

        for (int i = 2; i < array.length; i += 2) {
            if (array[i] < 0 && array[i] < average && array[i] % 9 == 0 && Math.abs(array[i]) > 50) {
                count++;
            }
        }

        return count;
    }
}

class PrintValue {
    void printValue(int val) {
        System.out.println(val);
    }
}


public class FilterArray {

    public static void main(String[] args) {
        ArrayContainer arrayContainer = new ArrayContainer(new int[]{1, 2, -54});
        int[] input = arrayContainer.getArray();
        Filter filter = new Filter();
        int resultOfFilter = filter.filterValues(input);
        PrintValue printValue = new PrintValue();
        printValue.printValue(resultOfFilter);
    }

}
