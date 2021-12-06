package com.letscode.operations;
import java.util.Scanner;

public class Operations {
    public static void main (String[] args) {
        Scanner newNumber = new Scanner(System.in);
        System.out.print("Type 2 integers in the terminal and the answer of the main math operations will be shown \n");
        System.out.print("Insert the first number: ");
        int firstNumber = newNumber.nextInt();
        System.out.print("Insert the second number: ");
        int secondNumber = newNumber.nextInt();

        final int ADDITION = firstNumber + secondNumber;
        final int SUBTRACTION = firstNumber - secondNumber;
        final int MULTIPLICATION = firstNumber * secondNumber;
        final float DIVISION = (float) firstNumber/ secondNumber;

        System.out.printf("%d + %d = %d%n",firstNumber, secondNumber, ADDITION);
        System.out.printf("%d - %d = %d%n",firstNumber, secondNumber, SUBTRACTION);
        System.out.printf("%d * %d = %d%n",firstNumber, secondNumber, MULTIPLICATION);
        System.out.printf("%d / %d = %.2f%n",firstNumber, secondNumber, DIVISION);

    }
}
