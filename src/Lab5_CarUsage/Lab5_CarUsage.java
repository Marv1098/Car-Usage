/*
 * Author Marvin Tailor - CMPSC 221
 */
package Lab5_CarUsage;
import java.util.Scanner;

public class Lab5_CarUsage {
    private double TotalMiles;
    private int TotalGallons;
    private double MoneyForGas;

    public Lab5_CarUsage() {
        TotalMiles = 0;
        TotalGallons = 0;
        MoneyForGas = 0;
    }
    public void AddGas(int gallonsBought, double pricePaid) {
        MoneyForGas = pricePaid * gallonsBought;
        TotalGallons = TotalGallons + gallonsBought;
    }
    public void AddMiles(int milesDriven) {

        TotalMiles = (MoneyForGas + milesDriven);
    }
    public double Calc_MPG() {

        return TotalMiles / TotalGallons;
    }

    public static void main(String[] arg) {
        Scanner scnr = new Scanner(System.in);
        Lab5_CarUsage myCar = new Lab5_CarUsage();

        int milesDriven, gallonsFilled;
        double pricePerGallon;
        int choice;

        do{
            //THIS ASK THE USER TO INPUT NUMBER OF MILES DRIVEN AND VALIDATES THOSE MILES DRIVEN.
            do{
                System.out.print("How many miles have you driven: ");
                milesDriven = scnr.nextInt();
            }while(milesDriven < 0);

            //THIS ASK THE USER AMOUNT OF GALLONS FILLED IN THE CAR AND VALIDATES THE USER INPUT.
            // FOR GALLONS FILLED IN CAR IS VALID.
            do {
                System.out.print("How many gallons filled in car: ");
                gallonsFilled = scnr.nextInt();
            }while (gallonsFilled < 0);

            //THIS ASK THE USER FOR THE PRICE PER GALLON AND VALIDATES THE INPUT.
            do {
                System.out.print("What is the Price Per Gallon: ");
                pricePerGallon = scnr.nextDouble();
            }while (pricePerGallon < 0);

            myCar.AddMiles(milesDriven);
            myCar.AddGas(gallonsFilled,pricePerGallon);

            //THIS STATEMENT OUTPUTS THE MPG.
            System.out.println("Your MPG is: " + myCar.Calc_MPG());

            /*THIS STATEMENT ASK THE USER IF THEY WANT TO RUN THE PROGRAM AGAIN FOR ADDITIONAL MILEAGE DRIVEN AND
             ADDITIONAL GAS STOPS.*/
            System.out.print("1. Enter [0] to exit.\n" + "2. Enter any other number to continue. ");
            choice = scnr.nextInt();
        }while(choice != 0);
    }
}