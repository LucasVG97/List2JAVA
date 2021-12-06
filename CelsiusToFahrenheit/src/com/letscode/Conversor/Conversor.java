package com.letscode.Conversor;
import java.util.Scanner;

public class Conversor {
    public static void main (String[] args){
        Scanner celsiusScan = new Scanner(System.in);
        System.out.print("Insert the Celsius Temperature: ");
        float celsiusTemperature = celsiusScan.nextFloat();

        final float CELSIUS_TO_FAHRENHEIT = (celsiusTemperature * 1.8f) + 32;

        System.out.printf("The temperature in Fahrenheit is: %.2f °F", CELSIUS_TO_FAHRENHEIT);
        }
    }

