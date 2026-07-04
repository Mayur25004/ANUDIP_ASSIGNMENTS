import java.util.Scanner;

class User{
    int id;
    String name;
    public User(int id, String name){
        this.id = id;
        this.name = name;

    }
}

class details extends User{
    double salary;
    public details(int id, String name,double salary){
        super(id,name);
        this.salary = salary;
    }
    public double AnnualSalary(double salary){
        return salary*12;
    }
}
public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID: ");
        int id=sc.nextInt();
        System.out.println("Name: ");
        String name= sc.next();
        System.out.println("Salary: ");
        double salary=sc.nextDouble();



        details emp = new details( id, name,salary);
        System.out.println("Id "+ id +"\nName "+ name+"\nSalary "+salary+"\nAnnual Salary: "+ emp.AnnualSalary(salary));


    }
}
