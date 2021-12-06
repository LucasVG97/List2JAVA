package com.letscode.InchToCm;
import java.util.Scanner;

public class InchToCm {
    public static void main(String[] args){
        Scanner inchConverter = new Scanner(System.in);
        System.out.print("Insert how many inches to you want to convert to centimeter: ");
        float inches = inchConverter.nextFloat();
        float centimeter = inches * 2.54f;
        System.out.printf("%.2f in = %.2f cm", inches, centimeter);
    }
}
