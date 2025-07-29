package C01_IntroductionToJava;

import java.util.Scanner;

public class P06_ConvertMinutesIntoYearsAndDays {

        public static void main(String[] args){


            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter minutes: ");
            int minutes = scanner.nextInt();

            // 1 Минути = 0.0000019013 Години
            double years = minutes * 0.0000019013;

            System.out.println("The years are: " + years);

            //1 Минути = 0.00069444 Дни

            double days = minutes * 0.00069444;
            System.out.println("The days are: " + days);

        }

}
