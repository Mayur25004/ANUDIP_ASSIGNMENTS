package LABS;

import java.util.Scanner;


public class LAB_2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.println("Distance in km(Maximum 500): ");
        double km = input.nextDouble();

        System.out.println("truck mileage in km: ");
        double mileage = input.nextDouble();

        System.out.println("Fuel price per litre: ");
        double fuel_price = input.nextDouble();

        System.out.println("toll charges: ");
        double toll = input.nextDouble();

        System.out.println("Driver daily wage : ");
        double wage = input.nextDouble();

        System.out.println("Budget for trip: ");
        double budget = input.nextDouble();

        double days = Math.ceil(km/500) ;

        double fuel_cost= (km/mileage)* fuel_price;
        double wage_cost = wage * days;
        double total_cost = toll + wage_cost + fuel_cost;
        System.out.print("Fuel Cost: "+fuel_cost+ "\nWage Cost :"+ wage_cost+ "\nTotal Cost :"+ total_cost);

        double over_budget = total_cost-budget;
        double under_budget = budget-total_cost;
        if(total_cost>budget){
            System.out.println("\nOver budget by"+ over_budget);
        }
        else{
            System.out.println("\nWithin budget, savings:"+ under_budget);
        }
    }
}
