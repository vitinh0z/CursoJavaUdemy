package services;

public class PayPalServices implements OnlinePaymentService {

    public PayPalServices() {
    }

    @Override
    public Double paymentFee(Double amount){
        return 0.0;
    }

    @Override
    public Double interest(Double month, Double integer) {
        return 0.0;
    }

}
