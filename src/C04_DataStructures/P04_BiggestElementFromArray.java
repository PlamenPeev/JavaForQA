package C04_DataStructures;

public class P04_BiggestElementFromArray {
    public static void main(String[] args) {

        int[] numbers = {10,5,310,20,99,15,25};

        int biggestNum = 0;

        for (int i = 0; i <numbers.length ; i++) {

            if(biggestNum < numbers[i]){
                biggestNum = numbers[i];
            }
        }

        System.out.println(biggestNum);
    }
}
