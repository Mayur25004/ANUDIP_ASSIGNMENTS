package LABS;

import java.util.Scanner;

public class LAB_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of units: ");
        int units = sc.nextInt();
        double bill=1;
        if(units<=100){
            bill = units * 1.50;
            System.out.println("Your bill :"+bill);
        } else if (units>=101 && units<=200) {
            bill = units * 2.50;
            System.out.println("Your bill :"+bill);
        }
        else if (units >200){
            bill = units *4;
            System.out.println("Your bill :"+bill);
        }
    }
}

