package com.letscode.timestable;
import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.print("Type a number between 1 and 10 that you want to see the times table: ");
        int typedNumber = number.nextInt();
        int[] timesTable = new int[11];
        for(int i = 0 ; i <= 10; i++){
            int result = typedNumber * i;
            timesTable[i] = result;
            System.out.printf("%d * %d = %d%n", typedNumber, i, timesTable[i]);
        }
    }
}
