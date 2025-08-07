package C03_ConditionalStatementsAndLoops;

import java.util.ArrayList;
import java.util.List;

public class P06_AverageOfListOfNumbers {
    public static void main(String[] args){
        List<Integer> list = List.of(10,20,30,40,50);
        int sum = 0;

        for (int i = 0; i < list.size() ; i++) {
            sum += list.get(i);
        }
        int average = sum / list.size();
        System.out.println("The average of a list of numbers is: " + average);
    }

}
