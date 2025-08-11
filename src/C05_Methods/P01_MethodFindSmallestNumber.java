package C05_Methods;

public class P01_MethodFindSmallestNumber {
    public static void main(String[] args) {

        int[] numbers = {14, 123, 45, 64, 9, 11, 93, 6, 131, 210};
           smallestNumber(numbers);
    }
    public static void smallestNumber(int[] nums){
           int smallestNum = nums[0];

           for( int currentNum : nums){
               if(smallestNum > currentNum ){
                   smallestNum = currentNum;
               }
           }
        System.out.println("The smallest number is: " + smallestNum);

    }
}
