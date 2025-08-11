package C05_Methods;

import java.util.Arrays;

public class P05_FindSecondLargestNumberInArray {
    public static void main(String[] args) {

        int[] numbers = {14, 123, 45, 152, 64, 9, 11, 93, 6, 131, 210};
        secondBigNumbersInArray(numbers);

    }
    public static void secondBigNumbersInArray(int[] nums){
        int[] sortedArray = Arrays.stream(nums)
                .sorted()
                .toArray();

        int secondBigNumbers = sortedArray[sortedArray.length - 2];
        System.out.println("The second big number in the array is: " + secondBigNumbers);
    }
}
