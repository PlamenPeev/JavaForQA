package C02_OperatorstAndExpressions;

import java.util.Scanner;

public class P06_LeapYear {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("The entered year " + year + " is a leap year");
        }
        else{
            System.out.println("The entered year " + year + " is not a leap year");
        }
    }
}
