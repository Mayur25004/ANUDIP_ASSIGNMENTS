//Exception Handling
class InsufficientBalEception extends Exception {
    public InsufficientBalEception(String message) {
    }
}
class Account{
    double balance =1900;


    void withdraw(double amount) {
        if(amount > balance || (balance-amount) <= 1000){
            //throws exception
            throw new InsufficientBalEception("Insufficient Balance");
        }
        else{
            balance-=amount;
            System.out.println("Balance: "+ balance);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Account ac = new Account();
        try{
            ac.withdraw(900);
        }
        catch (InsufficientBalEception e){
            System.out.println("Insufficient Balance");
        }
    }
}