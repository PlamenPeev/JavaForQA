package C02_OperatorstAndExpressions;

import java.util.Scanner;

public class P07_ConvertsTemperature {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Temperature that you want to convert: ");
        double temperature = scanner.nextDouble();
        System.out.println("Choose option: /CF - from Celsius to Fahrenheit/ or /FC - from Fahrenheit to Celsius/");
        Scanner scanner2 = new Scanner(System.in);
        String direction = scanner2.nextLine();

        double CFDirection = (temperature * 9/5) + 32;
        double FCDirection = (temperature - 32) * 5/9;


if(direction.contains("CF")){
    System.out.println("The temperature in F is: " + String.format("%.2f",CFDirection));
}
else if(direction.contains("FC")){
    System.out.println("The temperature in C is: " + String.format("%.2f",FCDirection));
}
else{
    System.out.println("The entered direction is not from the shown options");
}

    }
}
