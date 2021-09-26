/*
   The program is about basic conversion [Pounds to Kilograms] in Java.

   Date: 25th September, 2021.
   Group Members: Vinit J, Ujjwal S, Jay D, Anthony R.
   By: Vinit Jangir
*/

package Assignment_Three;

import java.util.Scanner; // Scanner class imported

public class Pounds2Kilograms {
    public static void main(String[] args){
        final double POUND2KILOG = 0.453592;
        Scanner input = new Scanner(System.in); // Scanner object created
        double inputLb = 0.0;
        double resultKilogram = 0.0;
        System.out.println("Pounds 2 Kilograms Conversion");
        System.out.println("Enter weight in Pounds(lb): "); // User input for weight in lb
        inputLb = input.nextDouble();
        resultKilogram = inputLb * POUND2KILOG; // lb 2 kg conversion
        System.out.print("Converted: " + inputLb + " to Pounds(lb)" + ": ");
        System.out.println(resultKilogram + " Kilograms");
        input.close();
    }
}
