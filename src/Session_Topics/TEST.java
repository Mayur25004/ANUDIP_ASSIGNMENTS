//Employee Management System (OOP)
//Problem Statement
//
//Create an Employee class with:
//
//Employee ID
//Name
//Salary
//Implement the following operations:
//Add Employee
//Search Employee
//Update Salary
//Delete Employee
//Display All Employees
//
//Use an ArrayList<Employee>.
// Concepts Tested
//Classes and Objects
//ArrayList
//Encapsulation
package Session_Topics;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TEST {
    static List<Integer> Id = new ArrayList<>();
    static List<String> name = new ArrayList<>();
    static List<Double> salary = new ArrayList<>();

    public static void Choice(int choice){
        Scanner sc = new Scanner(System.in);
        int count =0;
        switch (choice){
            case 1:
                System.out.print("How many employees : ");
                int n = sc.nextInt();
                while(Id.size() < n){
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Employee Name: ");
                    String Name = sc.next();
                    System.out.print("Enter Employee Salary: ");
                    double Salary = sc.nextDouble();
                    Id.add(id);
                    name.add(Name);
                    salary.add(Salary);
                }
                System.out.println("Entered details ");
                display(n);
                count =n;
                return;

            case 2:
                System.out.println("Enter Employee ID");
                int num1 = sc.nextInt();
                int idx = num1 -1;
                System.out.println("Employee ID :" +  Id.get(idx) + " Name: " + name.get(idx) + " Salary: " + salary.get(idx));
                return;

            case 3:
                System.out.println("Enter Employee ID to update ");
                int num2= sc.nextInt();
                int UpdateId= num2-1;
                System.out.println("enter the salary :");
                double UpdateSalary = sc.nextDouble();
                salary.set(UpdateId, UpdateSalary);
                System.out.println("UPDATED");
                display(Id.size());
                return;

            case 4:
                System.out.println("Enter Employee ID to delete ");
                int DeleteId= sc.nextInt();
                int index= DeleteId-1;
                Id.remove(index);
                name.remove(index);
                salary.remove(index);
                System.out.println("Updated List : ");
                display(Id.size());
                return;

            case 5:
                display(Id.size());
                break;
        }
    }
    public static void display(int n ){
        for(int i=0 ; i<n ; i++)
            System.out.println("Employee ID :" +  Id.get(i) + " Name: " + name.get(i) + " Salary: " + salary.get(i));
        return;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i=0;
        while(i<5) {
            System.out.println("Select: \n 1 for Adding Employee(id,name,salary) \n 2 for Search employee\n 3 for update salary\n 4 for delete employee\n 5 for display all ");
            int choice = sc.nextInt();
            Choice(choice);
            i++;
        }
    }
}
