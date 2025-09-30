package services;

public interface OnlinePaymentService {

   Double paymentFee (Double amount);

   Double interest (Double month, Double integer);
}
