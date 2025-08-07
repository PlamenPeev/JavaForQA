package C03_ConditionalStatementsAndLoops;

public class P05_SkippingNumBy3 {
    public static void main(String[] args){
        int[] numbers = {88, 54, 30, 98, -10, 73, 120, 11};

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 3 == 0){
               continue;
            }
            System.out.print(numbers[i] + " ");
        }

    }


}
