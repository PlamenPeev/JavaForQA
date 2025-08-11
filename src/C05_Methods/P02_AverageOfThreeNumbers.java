package C05_Methods;

import java.util.ArrayList;
import java.util.List;

public class P02_AverageOfThreeNumbers {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        numbers.add(14.0);
        numbers.add(25.0);
        numbers.add(31.0);
        averageOfNumbers(numbers);

    }
    public static void averageOfNumbers (List<Double> nums){

        double sum = 0;
        int count = 0;
        for( double num : nums){
            sum += num;
            count++;
        }
        double average = sum / count;
        System.out.println("The average of numbers is: " + String.format("%.2f",average));

    }
}
