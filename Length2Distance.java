/*
   The program is about basic conversion [Length to Distance] in Java.

   Date: 25th September, 2021.
   Group Members: Vinit J, Ujjwal S, Jay D, Anthony R.
   By: Vinit Jangir
*/

package Assignment_Three;

import java.util.Scanner; // Scanner class imported

public class Length2Distance {
    public static void main(String[] args){
        final double MILE2KILOM = 1.60935;
        Scanner input = new Scanner(System.in); // Scanner object created
        double inputMile = 0.0;
        double resultKilometre = 0.0;
        System.out.println("Miles 2 Kilometres Conversion");
        System.out.println("Enter distance in Miles: "); // User input for distance in miles
        inputMile = input.nextDouble();
        resultKilometre = inputMile * MILE2KILOM; // miles 2 km conversion
        System.out.print("Converted: " + inputMile + " to Miles" + ": ");
        System.out.println(resultKilometre + " Kilometres");
        input.close();
    }
}
