package LABS;

import java.util.Scanner;
public class LAB_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Item Name :");
        String item_name= sc.nextLine();
        System.out.println("Quantity :");
        int Quantity= sc.nextInt();
        System.out.println("Unit Price :");
        float Price_per_unit=  sc.nextFloat();
        System.out.println("Is a member, yes(1) or no(0)");
        int member=  sc.nextInt();

        double subtotal= Quantity * Price_per_unit;
        double discount =0;
        if(member ==1){
            discount = subtotal *0.10;
            subtotal = subtotal - discount;
        }
        double gst;
        if(discount>500){
            gst = discount * 0.05;
        }
        else{
            gst = discount * 0.12;
        }

        double Final_total = subtotal + gst;

        System.out.println("Subtotal :"+subtotal);
        System.out.println("Amount after discount: "+ discount);
        System.out.println("Final Total :"+ Final_total);
    }
}
