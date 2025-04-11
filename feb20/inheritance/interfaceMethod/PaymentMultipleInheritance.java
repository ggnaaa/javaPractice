package feb20.interfaceMethod;

interface Payment{
    void processPayment();
}
class CreditCardPayment implements Payment{
    public void processPayment() {
        System.out.println("process creditcard payment");
    }
}
class PayPalPayment implements Payment{
    public void processPayment() {
        System.out.println("process paypal payment");
    }
}
public class PaymentMultipleInheritance {
    public static void main(String[] args) {
        CreditCardPayment t=new CreditCardPayment();
        PayPalPayment p=new PayPalPayment();
        p.processPayment();
        t.processPayment();
    }
}
