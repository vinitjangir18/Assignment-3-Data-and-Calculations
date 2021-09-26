/*
   The program is about basic conversion [Gallon to Litres] in Java.

   Date: 25th September, 2021.
   Group Members: Vinit J, Ujjwal S, Jay D, Anthony R.
   By: Vinit Jangir
*/

package Assignment_Three;

import java.util.Scanner; // Scanner class imported

public class Gallons2Litres {
    public static void main(String[] args){
        final double GAL2LT = 3.78541;
        Scanner input = new Scanner(System.in); // Scanner object created
        double inputGallons = 0.0;
        double resultLiters = 0.0;
        System.out.println("Gallons to liter converter: ");
        System.out.println("Enter number of Gallons: "); // User input for gallons
        inputGallons = input.nextDouble();
        resultLiters = inputGallons * GAL2LT; // gallon 2 litre conversion
        System.out.print("Converted: " + inputGallons + " to Gallons" + ": ");
        System.out.println(resultLiters + " Litres");
        input.close();
    }
}
