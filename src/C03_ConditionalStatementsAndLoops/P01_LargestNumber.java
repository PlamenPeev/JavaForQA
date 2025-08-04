package C03_ConditionalStatementsAndLoops;

public class P01_LargestNumber {
    public static void main(String[] args){

        int[] numbers = {5, 87, 54, 17, 99, -10, 73, 121, 9};

        int maxNum = numbers[0];

        for (int i = 0; i < numbers.length-1; i++) {

            if(numbers[i] > maxNum){
                maxNum = numbers[i];
            }

        }

        System.out.println("The largest number into array is: " + maxNum);

    }
}
