package C05_Methods;

import java.util.Arrays;
import java.util.List;

public class P07_LastCharacterOfAString {
    public static void main(String[] args) {
        String text = "Celebration";
        lastCharacterOfAString(text);
    }
    public static void lastCharacterOfAString(String input){
        if(input.isEmpty()){
            System.out.println("There is no last character");
        }else {
            char lastChar = input.charAt(input.length() - 1);
            //String lastChar = input.substring(input.length() - 1);
            System.out.println("The last char is an text is: " + "'" + lastChar + "'");
        }
    }
}
