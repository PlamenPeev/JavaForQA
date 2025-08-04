package C03_ConditionalStatementsAndLoops;

public class P04_FirstMultipleBy5 {
    public static void main(String[] args){
        int[] numbers = {87, 54, 17, 99, -10, 73, 121, 9};

        int firstMultipleOf5 = 0;

        for (int i = 0; i < numbers.length-1; i++) {
            if(numbers[i] % 5 == 0){
                firstMultipleOf5 = numbers[i];
                break;
            }
        }
        System.out.println("The first number multiple of 5 is: " + firstMultipleOf5);
    }
}
