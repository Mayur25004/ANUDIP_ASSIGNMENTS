package LABS;
//Multithreading
class Average extends Thread {

    public void run(){
        double sum=0;
        for(int i=1;i<=10;i++){
            sum+=i;
        }
        double avg= sum/10;
        System.out.println("Average Balance is "+ avg);
    }
}
class Square extends Thread {
    public void run(){
        int[] arr={1,20,50,15,30};
        System.out.println("the square root oin the array");
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Square of the "+ arr[i] + " is " + arr[i]*arr[i]);
        }
    }
}
public class LAB_7 {
    public static void main(String[] args) {
        Square sq = new Square();
        Average avg = new Average();
        try{
            sq.start();
            sq.join();
            avg.start();
            avg.join();
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());

        }
    }
}
