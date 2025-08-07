package C04_DataStructures;

public class P01_SumOfElementsFromArray {
    public static void main(String[] args) {

        int[] numbers = {10,5,20,15,25};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println(sum);
    }
}
