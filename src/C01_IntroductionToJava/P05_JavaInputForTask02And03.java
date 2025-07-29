package C01_IntroductionToJava;

import java.util.Scanner;

public class P05_JavaInputForTask02And03 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side A: ");
        double a = scanner.nextDouble();
        System.out.println("Enter side B: ");
        double b = scanner.nextDouble();
        System.out.println("Enter side C: ");
        double c = scanner.nextDouble();
        // P = a + b + c
        double perimeterOfTriangle = a + b + c;

        System.out.println("The Perimeter of Triangle is: " + perimeterOfTriangle);

        System.out.println("------------------------------------");

        System.out.println("Enter base side: ");
        double base = scanner.nextDouble();
        System.out.println("Enter the height on that side: ");
        double height = scanner.nextDouble();
        // P = 1/2 * a * ha
        double areaOfTriangle = (base * height) * 0.5;

        System.out.println("The Area of Triangle is: " + areaOfTriangle);


    }

}
