package C02_OperatorstAndExpressions;

import java.util.Scanner;

public class P02_DaysOfTheWeek {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7: ");
        int day = scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("The 1-st day of the week is Monday");
                break;
            case 2:
                System.out.println("The 2-nd day of the week is Tuesday");
                break;
            case 3:
                System.out.println("The 3-rd day of the week is Wednesday");
                break;
            case 4:
                System.out.println("The 4-th day of the week is Thursday");
                break;
            case 5:
                System.out.println("The 5-th day of the week is Friday");
                break;
            case 6:
                System.out.println("The 6-th day of the week is Saturday");
                break;
            case 7:
                System.out.println("The 7-st day of the week is Sunday");
                break;
            default:
                System.out.println("The week has only seven days.\nThe entered number is less than 1 or bigger than 7");
        }
    }
}
