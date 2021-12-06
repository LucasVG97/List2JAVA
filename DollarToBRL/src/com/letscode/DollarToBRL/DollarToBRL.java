package com.letscode.DollarToBRL;
import java.util.Scanner;

public class DollarToBRL {
    public static void main(String[] args) {
        Scanner numberScan = new Scanner(System.in);
        System.out.print("Insert the USD to BRL exchange rate: ");
        float exchangeRate = numberScan.nextFloat();
        System.out.print("Insert the BRL amount that you want to convert: ");
        float BRL = numberScan.nextFloat();
        float result = BRL / exchangeRate;
        System.out.printf("%.2f BRL = %.2f USD", BRL, result);
    }

}
