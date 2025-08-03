package C02_OperatorstAndExpressions;

import java.util.Scanner;

public class P05_Vacation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter type of Vacation: ");
        String typeOfVacation = scanner.nextLine();

        if(!typeOfVacation.equals("Beach") && !typeOfVacation.equals("Mountain")){
            System.out.println("There is no information about this type of vacation");
        }
        else{
            System.out.println("Enter your budget: ");
            double budget = scanner.nextDouble();
            switch (typeOfVacation){
                case "Beach":
                    if(budget < 50){
                        System.out.println("Go to Bulgaria!");
                    }else{
                        System.out.println("Go outside to Bulgaria");
                    }
                    break;
                case "Mountain":
                    if(budget < 30){
                        System.out.println("Go to Bulgaria!");
                    }else{
                        System.out.println("Go outside to Bulgaria");
                    }
                    break;
                default:
                    break;
            }
        }



    }
}
