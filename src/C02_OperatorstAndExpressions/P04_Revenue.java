package C02_OperatorstAndExpressions;

import java.util.Scanner;

public class P04_Revenue {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();
        double quantity = scanner.nextDouble();
        double discount = 0;

        if(quantity>=100 && quantity<=120){
            discount= 0.15;
        }
        if(quantity>120){
            discount= 0.20;
        }

        double amount = price * quantity;
        double revenue = amount - (amount*discount);
        double valueDiscaunt = amount*discount;

        System.out.println("The revenue from sale: " + revenue + "$");
        System.out.println("Discount: " + valueDiscaunt + "$");
    }
}
