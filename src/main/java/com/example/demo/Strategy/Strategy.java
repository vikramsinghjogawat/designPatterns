interface PaymentStrategy{
    int process(Integer amount);
}
class UPIPaymentStrategy implements PaymentStrategy{

    @Override
    public int process(Integer amount) {
        System.out.println("Processing UPI Payment...");
        return 0;
    }
}

class CardPaymentStrategy implements PaymentStrategy{

    @Override
    public int process(Integer amount) {
        System.out.println("Processing Card Payment...");
        return 0;
    }
}

class CashPaymentStrategy implements PaymentStrategy{

    @Override
    public int process(Integer amount) {
        System.out.println("Processing Cash Payment...");
        return 0;
    }
}

class PaymentService{
    private final Map<String, PaymentStrategy> strategyMap;
    PaymentService(Map<String, PaymentStrategy> map){
        strategyMap = map;
    }

    void process(String type, Integer amount){
        PaymentStrategy paymentStrategy = strategyMap.get(type);
        if(paymentStrategy==null)  throw new IllegalArgumentException();
        paymentStrategy.process(amount);
    }
}
