package LABS;
//Grade system
import java.util.Arrays;
import java.util.Scanner;

public class LAB_3_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name: ");
        String name = sc.nextLine();

        System.out.println("enter marks: ");
        int[] marks_list= new int[5];
        for(int i=0; i<5;i++){
            marks_list[i] = sc.nextInt();
        }
        generate_report(name, marks_list);
    }
    public static float calculate_average(int[] marks){
        int avg=0;
        for(int i=0;i<marks.length;i++){
            avg +=marks[i];
        }
        return (float)avg/marks.length;
    }
    public static String determine_grade(float avg){
        if(avg>=90){
            return "A+";
        }else if(avg>=80){
            return "A";
        }else if(avg>=70){
            return "B";
        }else if(avg>=60){
            return "C";
        }else if(avg>=50){
            return "D";
        }else{
            return "F";
        }
    }
    public static boolean is_passed(String grade){
        if(grade.equals("F")){
            return false;
        } else{
            return true;
        }
    }
    public static void generate_report(String name, int[] marks){
        float avg = calculate_average(marks);
        String grade = determine_grade(avg);
        boolean passed = is_passed(grade);

        System.out.println("Name: "+name);
        System.out.println("Marks: "+ Arrays.toString(marks));
        System.out.println("Average: "+avg);
        System.out.println("Grade: "+grade);
        System.out.println("Passed: "+passed);
    }
}
