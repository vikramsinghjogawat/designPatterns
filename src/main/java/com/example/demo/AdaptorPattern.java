package com.example.demo.practice;

public class AdaptorPattern {
    public static void main(String[] args) {
        //Client
        PaymentService paymentService= new PaypalAdaptor(new PaypalGateway());
        String result = paymentService.processPayment();
        if(result.equals("SUCCESS")) System.out.println( "Payment is processed.");
        else if(result.equals("FAILURE")) System.out.println("Payment failed");
        // Approach
        //1.First make a central class that the client is using as interface(Payment Service).
        //2.Then make Adaptor classes implementing interface. They should have the incompitable classes reference.
        //3. Implement the interface method and write the necessary code to make it compitable.

    }
}
interface PaymentService{
    public String processPayment();
}

class RazorpayAdaptor implements PaymentService{
    RazorPayGateway razorPayGateway;
    RazorpayAdaptor( RazorPayGateway razorPayGateway){
        System.out.println("RazorPay adaptor constructor called.");

        this.razorPayGateway = razorPayGateway;
    }
    @Override
    public String processPayment() {
        return razorPayGateway.doTransaction() ?"SUCCESS":"FAILURE";
    }
}

class RazorPayGateway{
    public boolean doTransaction(){
        return true;
    }
}

class PaypalAdaptor implements PaymentService{
    PaypalGateway paypalGateway ;

    public PaypalAdaptor(PaypalGateway paypalGateway) {
        System.out.println("Paypal adaptor constructor called.");
        this.paypalGateway = paypalGateway;
    }

    @Override
    public String processPayment() {
        return paypalGateway.txn()==1?"SUCCESS":"FAILURE";
    }
}
class PaypalGateway {
    public int txn(){
        return 1;
    }
}
