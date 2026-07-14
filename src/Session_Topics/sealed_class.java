package Session_Topics;

abstract sealed class Payment permits CreditCardPayment, UPIpayment, NetBankingPayment{
    abstract void pay(double salary);
}

final class CreditCardPayment extends Payment {
    void pay(double salary){
        System.out.println("CC");
    }
}

final class UPIpayment extends Payment {
    void pay(double salary){
        System.out.println("UPI");
    }
}

final class NetBankingPayment extends Payment {
    void pay(double salary){
        System.out.println("NetBanking");
    }
}


public class sealed_class {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        p1.pay(10000);

        Payment p2 = new NetBankingPayment();
        p2.pay(2000);

        Payment p3 = new UPIpayment();
        p3.pay(50000);

    }

}