package C03_ConditionalStatementsAndLoops;

import java.util.ArrayList;
import java.util.List;

public class P03_ReverseList {
    public static void main(String[] args){
        List<Integer> list = List.of(10,20,30,40,50);
        List<Integer> reversed = new ArrayList<>();

        for (int i = list.size()-1; i >= 0 ; i--) {
            reversed.add(list.get(i));
        }
        for(int num : reversed){
            System.out.print(num + " ");
        }
    }
}
