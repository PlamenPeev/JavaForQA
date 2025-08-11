package C05_Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P04_CountWordInString {
    public static void main(String[] args) {

        String text = "The day of celebration is the Big day.";
        countWordInString(text);
    }

    public static void countWordInString(String input){
         int count = 0;
        List<String> words = Arrays.asList(input.split(" "));
        for(String word : words){
            count++;
        }
        System.out.println("The count of words in the text is: " + count);
    }
}
