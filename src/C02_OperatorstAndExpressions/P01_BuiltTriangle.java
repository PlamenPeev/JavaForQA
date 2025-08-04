package C02_OperatorstAndExpressions;

import java.util.Scanner;

public class P01_BuiltTriangle {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int angleA = scanner.nextInt();
        int angleB = scanner.nextInt();
        int angleC = scanner.nextInt();
        String typeOfTheTriangle = "";

        if( (angleA + angleB + angleC) == 180){
                if(angleA!=angleB && angleB!=angleC && angleC!=angleA){
                   typeOfTheTriangle = "multifaceted";
                   System.out.println("The triangle is " + typeOfTheTriangle);
                }
                if((angleA<90 && angleB<90 && angleC<90) &&
                        ((angleA==angleB || angleA==angleC && angleC!=angleB)
                    || (angleB==angleA || angleB==angleC && angleC!=angleA)
                     || (angleC==angleB || angleC==angleA && angleB!=angleA))){
                         typeOfTheTriangle = "isosceles";
                     System.out.println("The triangle is " + typeOfTheTriangle);
                }
                if(angleA==angleB && angleB==angleC && angleC==angleA){
                typeOfTheTriangle = "equilateral";
                System.out.println("The triangle is " + typeOfTheTriangle);
                }
                if(angleA>90 || angleB>90 || angleC>90){
                typeOfTheTriangle = "obtuse";
                System.out.println("The triangle is " + typeOfTheTriangle);
                }
                if((angleA==90 && angleB<90 && angleC<90)
                ||(angleA<90 && angleB==90 && angleC<90)
                ||(angleA<90 && angleB<90 && angleC==90)){
                typeOfTheTriangle = "right-angled";
                System.out.println("The triangle is " + typeOfTheTriangle);
                }
                if(angleA<90 && angleB<90 && angleC<90){
                typeOfTheTriangle = "acute";
                System.out.println("The triangle is " + typeOfTheTriangle);
                }
        }
        else{
            System.out.println("The triangle can't be built");

        }

    }
}
